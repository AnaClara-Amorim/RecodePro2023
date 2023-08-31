package principal;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente obj_cliente = new Cliente("Flavio", "5554445522", "1162254874");
		Vendedor obj_vendedor = new Vendedor (01, "Nome", 1000);
		Cliente obj_cliente2 = new Cliente();		

		Pedido pedido = new Pedido(0, null, obj_cliente2);
		Pedido pedido2 = new Pedido(2, new Date(), obj_cliente2);
		pedido.setId(1);

		pedido.setCliente(obj_cliente);

		pedido.setData(new Date());		
		System.out.println(pedido.getId());

		System.out.print(pedido.getCliente().getNome());
		
		System.out.println(pedido.getVendedor().getNome());
	}

 

}