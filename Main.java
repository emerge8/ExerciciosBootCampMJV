import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Cadastro> cadastros = new LinkedHashSet();

        Cadastro cadastro1 = new Cadastro();
        cadastro1.setNome("Anakin SkyWalker");
        cadastro1.setCpf("987.654.321-00");
        cadastro1.setDataNascimento(LocalDate.parse("2599-11-10"));
        cadastro1.setSexoNascimentoIdentificado(SexoNascimentoIdentificado.valueOf("M"));
        cadastro1.setLogradouro("Outro Planeta");
        cadastro1.setNumero("nº 99");
        cadastro1.setBairro("Falcon");
        cadastro1.setComplemento("Millennium");
        cadastro1.setCidade("São Paulo");
        cadastro1.setEstado("SP");
        cadastro1.setEmail("anakinSkywalker.com");
        cadastro1.setTelefone(998909361);
        cadastro1.setCelular(998909361);
        cadastro1.setCelularWhats(true);
        cadastro1.setProfissao("Desenvolvedor Das Galaxias");
        cadastro1.setEmpresa("Jedi's Company");
        cadastro1.setSalario(9.999);
        cadastro1.setEmpregoAtual(true);
        cadastro1.setPretencaoMinima(9.900);
        cadastro1.setPretencaoMaxima(9.000);
        cadastro1.setHabilidades("Java, OutSystems, PHP");

        Cadastro cadastro2 = new Cadastro();
        cadastro2.setNome("Leia SkyWalker");
        cadastro2.setCpf("069.036.000-85");
        cadastro2.setDataNascimento(LocalDate.parse("2599-11-10"));
        cadastro2.setSexoNascimentoIdentificado(SexoNascimentoIdentificado.valueOf("F"));
        cadastro2.setLogradouro("Outro Planeta");
        cadastro2.setNumero("nº 4");
        cadastro2.setBairro("Falcon");
        cadastro2.setComplemento("Millenium");
        cadastro2.setCidade("São Paulo");
        cadastro2.setEstado("SP");
        cadastro2.setEmail("leiaOrgana.com");
        cadastro2.setTelefone(998909361);
        cadastro2.setCelular(999999999);
        cadastro2.setCelularWhats(true);
        cadastro2.setProfissao("Desenvolvedora Das Estrelas");
        cadastro2.setEmpresa("Jedi's Company");
        cadastro2.setSalario(2.500);
        cadastro2.setEmpregoAtual(true);
        cadastro2.setPretencaoMinima(9.000);
        cadastro2.setPretencaoMaxima(9.800);
        cadastro2.setHabilidades("Java, OutSystems, PHP");

        Cadastro cadastro3 = new Cadastro();
        cadastro3.setNome("Jar Jar Binks");
        cadastro3.setCpf("085.036.000-85");
        cadastro3.setDataNascimento(LocalDate.parse("2599-11-10"));
        cadastro3.setSexoNascimentoIdentificado(SexoNascimentoIdentificado.valueOf("M"));
        cadastro3.setLogradouro("Outro Planeta");
        cadastro3.setNumero("nº 4");
        cadastro3.setBairro("Pantano");
        cadastro3.setComplemento("Naboo");
        cadastro3.setCidade("InterGalático");
        cadastro3.setEstado("SP");
        cadastro3.setEmail("jarBinkstadebrinks.com");
        cadastro3.setTelefone(998909361);
        cadastro3.setCelular(999999999);
        cadastro3.setCelularWhats(true);
        cadastro3.setProfissao("Desenvolvedora Das Águas");
        cadastro3.setEmpresa("Jedi's Company");
        cadastro3.setSalario(5.250);
        cadastro3.setEmpregoAtual(true);
        cadastro3.setPretencaoMinima(4.400);
        cadastro3.setPretencaoMaxima(8.600);
        cadastro3.setHabilidades("Java, OutSystems, PHP");

        cadastros.add(cadastro1);
        cadastros.add(cadastro2);
        cadastros.add(cadastro3);

        SalvarDados salvarCSV = new SalvarDados();
        salvarCSV.escreverNoAruivoCSV(cadastros);

    }
}