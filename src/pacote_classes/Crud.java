package pacote_classes;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Crud {
	
	public ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	public ArrayList<Cliente> insertCliente(Cliente p) {
		
		listaClientes.add(p);
		return listaClientes;
		
	}
	
	
	public ArrayList<Cliente> deleteCliente(int id_cl) throws Exception {
		
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == id_cl) {
				listaClientes.remove(cl);
				return listaClientes;
			}
		}
		throw new Exception ("Cliente não existe.");
	
		
	}
	
	public ArrayList<Cliente> uptadeCliente(int id_cl) throws Exception {
				Cliente cl;
				cl = getCliente(id_cl);
				
				
				String razaoSocial = JOptionPane.showInputDialog(null, "Digite a nova razao social do cliente:");
				String fantasia = JOptionPane.showInputDialog(null, "Digite o novo nome fantasia do cliente caso houver:");
				String logradouro = JOptionPane.showInputDialog(null, "Digite a nova cidade do cliente:");
				int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o  novo numero da residencia do cliente:"));
				String quadra = JOptionPane.showInputDialog(null, "Digite a nova quadra do cliente:");
				String lote = JOptionPane.showInputDialog(null, "Digite o novo lote do cliente:");
				String bairro = JOptionPane.showInputDialog(null, "Digite o novo bairro do cliente:");
				String uf = JOptionPane.showInputDialog(null, "Digite a nova UF do estado do cliente:");
				
				cl.razaoSocial = razaoSocial;
				cl.fantasia = fantasia;
				cl.logradouro = logradouro;
				cl.numero = numero;
				cl.quadra = quadra;
				cl.lote = lote;
				cl.bairro = bairro;
				cl.uf = uf;
		
			
		
	
		
		return listaClientes;
		
		
	}
	
	public String showCliente(int id_cl) throws Exception {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == id_cl) {
				return cl.printCliente();
			} 
		}
		throw new Exception ("Cliente não existe.");
		
		
	}
	
	public Cliente getCliente(int id_cl) throws Exception {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == id_cl) {
				return cl;
			} 
		}
		throw new Exception ("Cliente não existe.");
		
		
	}
	
	
	
	

}
