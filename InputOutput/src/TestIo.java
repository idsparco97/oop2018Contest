/*
 -----------------------CODIFICA UTF8-------------------------
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author Gennaro
 */
public class TestIo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Persona> s = new HashSet();
        s.add(new Persona("Luigi", 1.86, 27));
        s.add(new Persona("Marco", 1.75, 34));
        s.add(new Persona("Rosa", 1.78, 21));
        s.add(new Persona("Marta", 1.65, 38));
        
        System.out.println(s);
        
        scriviUsandoObjectOutputStream("prova.bin", s);
        Set<Persona> s2 = leggiUsandoObjectInputStream("prova.bin");
        if(s2==null)
            System.out.println("Lettura fallita");
        else
            System.out.println("Lettura riuscita\n"+s2);

        scriviUsandoDataOutputStream("prova2.bin", s);
        Set<Persona> s3 = leggiUsandoDataInputStream("prova2.bin");
        if(s3==null)
            System.out.println("Lettura fallita");
        else
            System.out.println("Lettura riuscita\n"+s3);

    }
    
    
    private static Set<Persona> leggiUsandoDataInputStream(String nomeFile){
        Set<Persona> s = new HashSet();
        
        try(DataInputStream i = new DataInputStream(new BufferedInputStream(new FileInputStream(nomeFile)))){
            int size = i.readInt();
            String nome; 
            double altezza; 
            int eta;
            for(int k=1; k<=size; k++){
                nome = i.readUTF();
                altezza = i.readDouble();
                eta = i.readInt();
                s.add(new Persona(nome, altezza, eta));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        return s;
    }
    
    private static Set<Persona> leggiUsandoObjectInputStream(String nomeFile){
        Set<Persona> s = null;
        
        try(ObjectInputStream i = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomeFile)))){
            s = (Set<Persona>)i.readObject();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        return s;
    }
    
    private static void scriviUsandoDataOutputStream(String nomeFile, Set<Persona> s){
        try(DataOutputStream o = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nomeFile)))){
            o.writeInt(s.size());
            for(Persona p: s){
                o.writeUTF(p.getNome());
                o.writeDouble(p.getAltezza());
                o.writeInt(p.getEta());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    private static void scriviUsandoObjectOutputStream(String nomeFile, Set<Persona> s){
        
        try(ObjectOutputStream o = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomeFile)))){
            o.writeObject(s);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
private static Set<Persona> leggiUsandoReader(String nomeFile) throws IOException{
    
    Set<Persona> s = new HashSet();
    Scanner sc= new Scanner(new File(nomeFile));
    sc.useDelimiter(";");
    
    while(sc.hasNext()){
        s.add(new Persona(
        sc.next(),
        sc.nextInt(), (int) sc.nextDouble()));
        sc.nextLine();
    }
    return s;
    
         
}
private static void scriviUsandoWrtiter(String nomeFile,Set<Persona> s) throws IOException{
    
    try( PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile)))){
        for(Persona p: s ){
            out.write(p.getNome()+";"+p.getEta()+";"+p.getAltezza()+"\n");
        }
    }

}
}






