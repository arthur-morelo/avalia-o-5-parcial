import sistemapessoa.ConfiguracoesSistema;

public class TesteConfiguracoes {
    public static void main(String[] args) {
        System.out.println("Versão do Sistema: " + ConfiguracoesSistema.VERSAO_SISTEMA);
        System.out.println("Nome do Usuário: " + ConfiguracoesSistema.NOME_USUARIO);
        System.out.println("Data de Acesso: " + ConfiguracoesSistema.DATA_ACESSO);
    }
}