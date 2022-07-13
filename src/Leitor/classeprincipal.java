package Leitor;

public class classeprincipal extends variaveis{ //uso de herança

	public static void main(String args[]) {

		System.out.print("Quantos produtos deseja adicionar? ");
		num = sc.nextInt();

		while (cont <= num) {
			System.out.printf("\nDigite o Produto %s: ", cont); /* OBS: Se for produto com nome composto 
			                                                      digitar tudo junto! EX: leite-ninho */
			prod = sc.next();
			
			System.out.printf("Digite o o preço do produto %s: ", cont); /*OBS: Digitar tudo junto sem cifrão	
			                                                                EX: 10,00  */
			etiqueta = sc.nextDouble(); 
			
			System.out.printf("\nO produto %s tem taxa de frabricação?[s/n] ", cont);
			String resp = sc.next();

			if (resp.equals("s")) {
				System.out.println("Sim");
				etiqueta = etiqueta * 1.5; // taxa de fabricação

			} else if (resp.equals("n")) {
				System.out.println("Não");

			} else {
				System.out.println("Opção inválida");
			}
			
			System.out.printf("\nO produto %s tem taxa da alfandega?[s/n] ", cont);
			String resp2 = sc.next();

			if (resp2.equals("s")) {
				System.out.println("Sim");
				etiqueta = etiqueta * 2.5; // taxa da alfandega

			} else if (resp2.equals("n")) {
				System.out.println("Não");

			} else {
				System.out.println("Opção inválida");
			}
			
			lista1.add(prod);
			lista2.add(etiqueta);
			
			cont++;
		}
		
		
		System.out.printf("\nProdutos --> %s \nPreços --> %s ",lista1,lista2);

		sc.close();
	}
}
