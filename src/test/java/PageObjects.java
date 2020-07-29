import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjects {
	
	protected void clicaLinkCadastrar(String id_campo) {
		DriverChrome.getDriver().findElement(By.linkText(id_campo)).click();
	}
	
	protected void escreveNomeUsuario(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.name(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorNome(String id_campo) {
		return DriverChrome.getDriver().findElement(By.name(id_campo)).getAttribute("value");	
	}

	protected void escreveSenha(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.name(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorSenha(String id_campo) {
		return DriverChrome.getDriver().findElement(By.name(id_campo)).getAttribute("value");
		
	}
	
	protected void escreveConfirmacaoSenha(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.name(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorConfirmacaoSenha(String id_campo) {
		return DriverChrome.getDriver().findElement(By.name(id_campo)).getAttribute("value");
	}
	
	protected void clicarBotaoCadastra(String id_campo) {
		DriverChrome.getDriver().findElement(By.className(id_campo)).click();
	}
	
	
	protected void clicarBotaoEntre(String id_campo) {
		DriverChrome.getDriver().findElement(By.className(id_campo)).click();
	}
	
	protected void clicarLinkNovoFuncionario(String id_campo) {
		DriverChrome.getDriver().findElement(By.xpath(id_campo)).click();
	}
	
	protected void escreveNomeFuncionario(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	protected String obterNomeFuncionario(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");	
	}
	
	protected void escreveCpfFuncionario(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorCpfFuncionario(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");	
	}
	
	protected  void selecionaComboSexo(String id_campo) {
		WebElement element = DriverChrome.getDriver().findElement(By.id("slctSexo"));
		Select comboBox = new Select(element);
		comboBox.selectByVisibleText("Masculino");
	}
	
	protected String obterValorComboSexo(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}
	
	protected void escreveDataAdmissao(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorDataAdmissao(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");	
	}
	
	protected void escreveCargoFuncionario(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorCargoFuncionario(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");	
	}
	
	protected void escreveSalarioFuncionario(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	protected String obterValorSalarioFuncionario(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");	
	}
	
	protected void selecionaContratacao(String id_campo) {
		DriverChrome.getDriver().findElement(By.id("clt")).click();
	}
	
	protected String obterValorContratacao(String id_campo) {
		return DriverChrome.getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}
	
	protected void clicarBotaoEnviar(String id_campo) {
		DriverChrome.getDriver().findElement(By.xpath(id_campo)).click();
	}
	
	protected void clicarBotaoExcluir(String colunaBusca, String valor, String colunaBotao, String idTabela) {
		// buscar coluna do registro
		WebElement tabela = DriverChrome.getDriver().findElement(By.xpath("//*[@id='tabela']"));
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		
		int idColuna = -1;
		
		for(int i=0; i < colunas.size(); i++) {
			if(colunas.get(i).getText().equals(colunaBusca)) {
				idColuna = i+1;
				System.out.println(idColuna);
				break;
			}
		}
		
		// encontrar a linha do registro
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td["+idColuna+"]"));
		int idLinha = -1;
		
		for(int j=0; j < linhas.size(); j++) {
			if(linhas.get(j).getText().equals(valor)) {
				idLinha = j+1;
				System.out.println(idLinha);
				break;
			}
		}
		
		// procurar coluna do botão
		List<WebElement> colunasBotao = tabela.findElements(By.xpath(".//th"));
		
		int idColunaBotao = -1;
		
		for(int i=0; i < colunasBotao.size(); i++) {
			if(colunasBotao.get(i).getText().equals(colunaBotao)) {
				idColunaBotao = i+1;
				System.out.println(idColunaBotao);
				break;
			}
		}
		
		// clicar no botao da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr["+idLinha+"]/td["+idColunaBotao+"]"));
		//celula.findElement(By.xpath(".//input")).click();
		celula.findElement(By.id("delete-btn")).click();
		
	}
	
	protected void clicarBotaoAlterar(String colunaBusca, String valor, String colunaBotao, String idTabela) {
		// buscar coluna do registro
		WebElement tabela = DriverChrome.getDriver().findElement(By.xpath("//*[@id='tabela']"));
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		
		int idColuna = -1;
		
		for(int i=0; i < colunas.size(); i++) {
			if(colunas.get(i).getText().equals(colunaBusca)) {
				idColuna = i+1;
				System.out.println(idColuna);
				break;
			}
		}
		
		// encontrar a linha do registro
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td["+idColuna+"]"));
		int idLinha = -1;
		
		for(int j=0; j < linhas.size(); j++) {
			if(linhas.get(j).getText().equals(valor)) {
				idLinha = j+1;
				System.out.println(idLinha);
				break;
			}
		}
		
		// procurar coluna do botão
		List<WebElement> colunasBotao = tabela.findElements(By.xpath(".//th"));
		
		int idColunaBotao = -1;
		
		for(int i=0; i < colunasBotao.size(); i++) {
			if(colunasBotao.get(i).getText().equals(colunaBotao)) {
				idColunaBotao = i+1;
				System.out.println(idColunaBotao);
				break;
			}
		}
		
		// clicar no botao da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr["+idLinha+"]/td["+idColunaBotao+"]"));
		celula.findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr/td["+idColunaBotao+"]/a[2]/button")).click(); 
	}
	
	protected void alterarValorSalario(String id_campo, String texto) {
		DriverChrome.getDriver().findElement(By.id(id_campo)).clear();
		DriverChrome.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
}
