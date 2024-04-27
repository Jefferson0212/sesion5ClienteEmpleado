
package javaapplication10.Entidades;


public class Cliente extends Persona{
    
    private String codCliente;
    
    public Cliente(){}
    public static Cliente fromPersona(Persona per){
        Cliente cli =new Cliente();
        cli.setNombre(per.getNombre());
        cli.setApellido(per.getApellido());
        cli.setDni(per.getDni());
        return cli;
    }

    public Cliente(String codCliente) {
        this.codCliente = codCliente;
    }
    @Override
    public String getText(){
        return "CLIENTE       : "+
                this.getNombre() + " " + 
                this.getApellido()+ " | DNI - Cliente: "+
                this.getDni();
    }

    

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    
    
}
