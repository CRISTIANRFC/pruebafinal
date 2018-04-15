public class Conexion {
    
    Connection connect=null;
    public Connection conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");  //jalar drivers de conexion
            connect = DriverManager.getConnection("jdbc:mysql://localhost/viajes","root","");
            JOptionPane.showMessageDialog(null, "Te conectaste");
         
        } catch (Exception ex) {
         
            JOptionPane.showMessageDialog(null, "Intenta de nuevo mas tarde");
        }
    
        return connect;
    }
   
    
}
