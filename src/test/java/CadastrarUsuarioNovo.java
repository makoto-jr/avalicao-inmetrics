import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarUsuarioNovo {
	
	PageObjects page =  new PageObjects();
	
	@Dado("^que estou acessando na tela inicial do site$")
	public void que_estou_acessando_na_tela_inicial_do_site() throws Throwable {
		DriverChrome.getDriver().get("http://www.inmrobo.tk/accounts/login/");
	}

	@Quando("^eu clicar no link cadastre-se$")
	public void eu_clicar_no_link_cadastre_se() throws Throwable {
		page.clicaLinkCadastrar("Cadastre-se");
	}

	@Quando("^digitar o nome de usuário \"([^\"]*)\"$")
	public void digitar_o_nome_de_usuário(String arg1) throws Throwable {
		page.escreveNomeUsuario("username", arg1);
		Assert.assertEquals(arg1, page.obterValorNome("username"));
	}

	@Quando("^digitar a senha \"([^\"]*)\"$")
	public void digitar_a_senha(String arg1) throws Throwable {
		page.escreveSenha("pass", arg1);
		Assert.assertEquals(arg1, page.obterValorSenha("pass"));;
	}

	@Quando("^digitar a confirmação da senha \"([^\"]*)\"$")
	public void digitar_a_confirmação_da_senha(String arg1) throws Throwable {
		page.escreveConfirmacaoSenha("confirmpass", arg1);
		Assert.assertEquals(arg1, page.obterValorConfirmacaoSenha("confirmpass"));
	}

	@Quando("^clicar no botão cadastrar$")
	public void clicar_no_botão_cadastrar() throws Throwable {
		page.clicarBotaoCadastra("login100-form-btn");
	}

	@Então("^o cadastro é realizado com sucesso$")
	public void o_cadastro_é_realizado_com_sucesso() throws Throwable {
		Assert.assertTrue(DriverChrome.getDriver().findElement(By.tagName("body")).getText().contains("Login"));
	}

	@Dado("^que estou acessando a tela de login$")
	public void que_estou_acessando_a_tela_de_login() throws Throwable {
		DriverChrome.getDriver().get("http://www.inmrobo.tk/accounts/login/");
	}

	@Quando("^eu digitar o nome de usuário \"([^\"]*)\"$")
	public void eu_digitar_o_nome_de_usuário(String arg1) throws Throwable {
		page.escreveNomeUsuario("username", arg1);
		Assert.assertEquals(arg1, page.obterValorNome("username"));
	}

	@Quando("^clicar no botão entre$")
	public void clicar_no_botão_entre() throws Throwable {
		page.clicarBotaoEntre("login100-form-btn");
	}

	@Então("^o login é realizado com sucesso$")
	public void o_login_é_realizado_com_sucesso() throws Throwable {
		String texto = DriverChrome.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).getText();
		Assert.assertEquals("SAIR", texto);
	}

	@Dado("^que estou na tela de login$")
	public void que_estou_na_tela_de_login() throws Throwable {
		DriverChrome.getDriver().get("http://www.inmrobo.tk/accounts/login/");
	}

	@Quando("^eu digitar o nome do usuário \"([^\"]*)\"$")
	public void eu_digitar_o_nome_do_usuário(String arg1) throws Throwable {
		page.escreveNomeUsuario("username", arg1);
		Assert.assertEquals(arg1, page.obterValorNome("username"));
	}

	@Quando("^clicar no link novos funcionários$")
	public void clicar_no_link_novos_funcionários() throws Throwable {
		DriverChrome.getDriver().get("http://www.inmrobo.tk/empregados/new_empregado");
	}

	@Quando("^digitar o nome do funcionário \"([^\"]*)\"$")
	public void digitar_o_nome_do_funcionário(String arg1) throws Throwable {
		page.escreveNomeFuncionario("inputNome", arg1);
		Assert.assertEquals(arg1, page.obterNomeFuncionario("inputNome"));
	}

	@Quando("^digitar o cpf do funcionário \"([^\"]*)\"$")
	public void digitar_o_cpf_do_funcionário(String arg1) throws Throwable {
		page.escreveCpfFuncionario("cpf", arg1);
		Assert.assertEquals(arg1, page.obterValorCpfFuncionario("cpf"));
	}

	@Quando("^selecionar o sexo do funcionário \"([^\"]*)\"$")
	public void selecionar_o_sexo_do_funcionário(String arg1) throws Throwable {
		page.selecionaComboSexo(arg1);
		Assert.assertEquals(arg1, page.obterValorComboSexo("slctSexo"));
	}

	@Quando("^digitar a data de admissão do funcionário \"([^\"]*)\"$")
	public void digitar_a_data_de_admissão_do_funcionário(String arg1) throws Throwable {
		page.escreveDataAdmissao("inputAdmissao", arg1);
		Assert.assertEquals(arg1, page.obterValorDataAdmissao("inputAdmissao"));
	}

	@Quando("^digitar o cargo do funcionário \"([^\"]*)\"$")
	public void digitar_o_cargo_do_funcionário(String arg1) throws Throwable {
		page.escreveCargoFuncionario("inputCargo", arg1);
		Assert.assertEquals(arg1, page.obterValorCargoFuncionario("inputCargo"));
	}

	@Quando("^digitar o valor do salário do funcionário \"([^\"]*)\"$")
	public void digitar_o_valor_do_salário_do_funcionário(String arg1) throws Throwable {
		page.escreveSalarioFuncionario("dinheiro", arg1);
		Assert.assertEquals(arg1, page.obterValorSalarioFuncionario("dinheiro"));
	}

	@Quando("^escolher a opção de contratação do funcionário \"([^\"]*)\"$")
	public void escolher_a_opção_de_contratação_do_funcionário(String arg1) throws Throwable {
		page.selecionaContratacao("clt");
		Assert.assertEquals(arg1, page.obterValorContratacao("clt"));
	}

	@Quando("^clicar no botão enviar$")
	public void clicar_no_botão_enviar() throws Throwable {
		page.clicarBotaoEnviar("/html/body/div/div[2]/div/form/div[3]/input");
	}

	@Então("^é exibido a mensagem de cadastro com sucesso$")
	public void é_exibido_a_mensagem_de_cadastro_com_sucesso() throws Throwable {
		Assert.assertTrue(DriverChrome.getDriver().findElement(By.tagName("body")).getText().contains("Usuário cadastrado com sucesso"));
	}

	@Quando("^clicar no botão alterar correspondente ao cpf \"([^\"]*)\"$")
	public void clicar_no_botão_alterar_correspondente_ao_cpf(String arg1) throws Throwable {
		page.clicarBotaoAlterar("CPF", arg1, "Manter", "tabela");
	}

	@Quando("^alterar o valor do salário \"([^\"]*)\"$")
	public void alterar_o_valor_do_salário(String arg1) throws Throwable {
		page.alterarValorSalario("dinheiro", arg1);
	}

	@Quando("^clicar no botão submeter$")
	public void clicar_no_botão_submeter() throws Throwable {
		page.clicarBotaoEnviar("/html/body/div/div/div/form/div[3]/input");;
	}

	@Então("^é exibido a mensagem de alteração com sucesso$")
	public void é_exibido_a_mensagem_de_alteração_com_sucesso() throws Throwable {
		Assert.assertTrue(DriverChrome.getDriver().findElement(By.tagName("body")).getText().contains("Informações atualizadas com sucesso"));
	}

	@Quando("^clicar no botão excluir correspondente ao cpf \"([^\"]*)\"$")
	public void clicar_no_botão_excluir_correspondente_ao_cpf(String arg1) throws Throwable {
		page.clicarBotaoExcluir("CPF", arg1, "Manter", "tabela");
	}

	@Então("^é exibido a mensagem de exclusão com sucesso$")
	public void é_exibido_a_mensagem_de_exclusão_com_sucesso() throws Throwable {
		Assert.assertTrue(DriverChrome.getDriver().findElement(By.tagName("body")).getText().contains("Funcionário removido com sucesso"));
	}
	
	@After
	public void encerra() {
		DriverChrome.killDriver();
	}
}