package tratamentosArray;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.RegraException;
import pacote_classes.Cliente;

public class TratamentosCliente {
	
	public static final List<Cliente> listaClientes = new ArrayList<>();
	
	
	private static String  fraseErro = "Cliente não existe.";
	
	public static List<Cliente> getListaClientes() {
		return listaClientes;
	}


	public static List<Cliente> insertCliente(Cliente p) {
		
		listaClientes.add(p);
		return listaClientes;
		
	}
	
	
	public static List<Cliente> deleteCliente(int idCl){
		
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				listaClientes.remove(cl);
				return listaClientes;
			}
		}
		throw new RegraException (fraseErro);
	
		
	}
	
	public static List<Cliente> uptadeCliente(int idCl) throws Exception{
				Cliente cl;
				cl = getCliente(idCl);
				
				
				String razaoSocial = JOptionPane.showInputDialog(null, "Digite a nova razao social do cliente:");
				String fantasia = JOptionPane.showInputDialog(null, "Digite o novo nome fantasia do cliente caso houver:");
				String logradouro = JOptionPane.showInputDialog(null, "Digite a nova cidade do cliente:");
				var numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o  novo numero da residencia do cliente:"));
				String quadra = JOptionPane.showInputDialog(null, "Digite a nova quadra do cliente:");
				String lote = JOptionPane.showInputDialog(null, "Digite o novo lote do cliente:");
				String bairro = JOptionPane.showInputDialog(null, "Digite o novo bairro do cliente:");
				String uf = JOptionPane.showInputDialog(null, "Digite a nova UF do estado do cliente:");
				
				cl.setRazaoSocial(razaoSocial);
				cl.setFantasia(fantasia);
				cl.setLogradouro(logradouro);
				cl.setNumero(numero);
				cl.setQuadra(quadra);
				cl.setLote(lote);
				cl.setBairro(bairro);
				cl.setUf(uf);
		
		
		return listaClientes;
		
		
	}
	
	public static String showCliente(int idCl) {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				return cl.printCliente();
			} 
		}
		throw new RegraException (fraseErro);
		
	}
	
	public static Cliente getCliente(int idCl) {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				return cl;
			} 
		}
		throw new RegraException (fraseErro);
		
	}
	public static boolean verificaCliente(int idCl) {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				return true;
			} 
		}
		return false;
	}
}
