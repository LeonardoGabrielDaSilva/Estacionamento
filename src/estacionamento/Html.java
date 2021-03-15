package estacionamento;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Html {

	private ExportarImportar ex = new ExportarImportar();
	private List<MarcasCadastradas> lista = new ArrayList<MarcasCadastradas>();
	private List<ProprietarioFrequente> listaP = new ArrayList<ProprietarioFrequente>();
	private List<Preco> listaPrecos = new ArrayList<Preco>();

	public void listarHTMLMarcas() throws IOException {

		lista = ex.importarMarcasCadastradas(lista);

		FileWriter arq = new FileWriter("Htmls/Marcas.html");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("%s\n", cabecalho());
		StringBuilder saida = new StringBuilder();
		saida.append("<tr><th>Marcas</th>");
		saida.append("<th>Quantidade</th>");

		for (MarcasCadastradas marca : lista) {
			saida.append("<tr><th>" + marca.getMarca().getDesc() + "</th>");
			saida.append("<th>" + marca.getContador() + "</th>");
		}

		gravarArq.printf("%s\n", saida);
		gravarArq.printf("%s\n", rodape());
		gravarArq.close();
	}

	public void listarHTMLProprietarios() throws IOException {

		listaP = ex.importarProprietarioFrequente(listaP);

		FileWriter arq = new FileWriter("Htmls/Proprietarios Frequentes.html");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("%s\n", cabecalho());
		StringBuilder saida = new StringBuilder();
		saida.append("<tr><th>Proprietario</th>");
		saida.append("<th>Quantidade de Usos</th>");

		for (ProprietarioFrequente prop : listaP) {
			saida.append("<tr><th>" + prop.getProprietario().getNome() + "</th>");
			saida.append("<th>" + prop.getContagem() + "</th>");
		}

		gravarArq.printf("%s\n", saida);
		gravarArq.printf("%s\n", rodape());
		gravarArq.close();
	}

	public void listarHTMLFaturamentoDiario() throws IOException {

		listaPrecos = ex.importarPreco(listaPrecos);

		FileWriter arq = new FileWriter("Htmls/Faturamento Diario.html");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("%s\n", cabecalho());
		StringBuilder saida = new StringBuilder();
		saida.append("<tr><th>Valor</th>");
		saida.append("<th>Data</th>");

		SimpleDateFormat dh = new SimpleDateFormat("dd/MM/yyyy");
		listaPrecos = ex.importarPreco(listaPrecos);
		DecimalFormat fmt = new DecimalFormat("0.00");

		int j = 1;
		double valor = listaPrecos.get(0).getValor();
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();

		if (listaPrecos.size() == 1) {
			saida.append("<tr><th>" + fmt.format(valor) + " R$" + "</th>");
			String data = dh.format(listaPrecos.get(0).getData());
			saida.append("<th>" + data + "</th>");
		} else {
			for (int k = 0; k < listaPrecos.size() - 1; k++) {
				c.setTime(listaPrecos.get(k).getData());
				c1.setTime(listaPrecos.get(j).getData());

				if (c.get(Calendar.DAY_OF_YEAR) == c1.get(Calendar.DAY_OF_YEAR)) {
					valor += listaPrecos.get(j).getValor();
				} else {
					saida.append("<tr><th>" + fmt.format(valor) + " R$" + "</th>");
					String data = dh.format(listaPrecos.get(k).getData());
					saida.append("<th>" + data + "</th>");
					valor = listaPrecos.get(j).getValor();
				}

				if (k == listaPrecos.size() - 2) {
					saida.append("<tr><th>" + fmt.format(valor) + " R$" + "</th>");
					String data = dh.format(listaPrecos.get(j).getData());
					saida.append("<th>" + data + "</th>");
				}
				j++;
			}
		}

		gravarArq.printf("%s\n", saida);
		gravarArq.printf("%s\n", rodape());
		gravarArq.close();
	}

	public void listarHTMLFaturamentoMensal() throws IOException {

		listaPrecos = ex.importarPreco(listaPrecos);

		FileWriter arq = new FileWriter("Htmls/Faturamento Mensal.html");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("%s\n", cabecalho());
		StringBuilder saida = new StringBuilder();
		saida.append("<tr><th>Valor</th>");
		saida.append("<th>Data</th>");

		SimpleDateFormat dh = new SimpleDateFormat("dd/MM/yyyy");
		listaPrecos = ex.importarPreco(listaPrecos);
		DecimalFormat fmt = new DecimalFormat("0.00");
		int j = 1;
		double valor = listaPrecos.get(0).getValor();
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();

		if (listaPrecos.size() == 1) {
			saida.append("<tr><th>" + fmt.format(valor) + " R$" + "</th>");
			String data = dh.format(listaPrecos.get(0).getData());
			saida.append("<th>" + data + "</th>");
		} else {
			for (int k = 0; k < listaPrecos.size() - 1; k++) {
				c.setTime(listaPrecos.get(k).getData());
				c1.setTime(listaPrecos.get(j).getData());

				if (c.get(Calendar.MONTH) == c1.get(Calendar.MONTH)) {
					valor += listaPrecos.get(j).getValor();
				} else {
					saida.append("<tr><th>" + fmt.format(valor) + " R$" + "</th>");
					String data = dh.format(listaPrecos.get(k).getData());
					saida.append("<th>" + data + "</th>");
					valor = listaPrecos.get(j).getValor();
				}

				if (k == listaPrecos.size() - 2) {
					saida.append("<tr><th>" + fmt.format(valor) + " R$" + "</th>");
					String data = dh.format(listaPrecos.get(j).getData());
					saida.append("<th>" + data + "</th>");
				}
				j++;
			}

		}

		gravarArq.printf("%s\n", saida);
		gravarArq.printf("%s\n", rodape());
		gravarArq.close();
	}

	public static String cabecalho() {
		StringBuilder html = new StringBuilder();
		html.append("<!DOCTYPE html>\n");
		html.append("<html>\n");
		html.append("<head><title>Listas</title>\n");
		html.append("<meta charset	=\"UTF-8\">\n");
		html.append("</head>\n");
		html.append("<body>\n");
		html.append("<table border=\"1\">\n");
		return html.toString();
	}

	public static String rodape() {
		StringBuilder html = new StringBuilder();
		html.append("</table>\n");
		html.append("</body>\n");
		html.append("</html>\n");
		return html.toString();
	}

}
