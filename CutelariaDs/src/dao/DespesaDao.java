
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import regrasDeNegocios.Despesa;
import regrasDeNegocios.Produto;
import utilitarios.ConexaoBD;


public class DespesaDao {
    public void inserir (Despesa d){
     Connection con = ConexaoBD.getConectarBD();
     String sql= "INSERT INTO despesa (descricao_desp,valor_desp,datavencimento_desp ,numerodoc_desp)"
             +"VALUES(?,?,?,?)";
     try(PreparedStatement stm = con.prepareStatement(sql)){
     
         stm.setString(1, d.getDescricao_desp());
         stm.setDouble(2, d.getValor_desp());
         stm.setString(3, d.getDatavencimento_desp());
         stm.setString(4, d.getNumerodoc_desp());
         stm.executeUpdate();
         con.close();
         JOptionPane.showMessageDialog(null,"cadastrado com sucesso!");
         
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Erro ao Cadastrar"+ex.getMessage());
     }
     
    }
    public void atualizar(Despesa d){
        Connection con = ConexaoBD.getConectarBD(); 
        String sql= "UPDATE despesa SET nome_desp=?, valor_desp=?, data_desp=?, formapag_desp=?,  WHERE id_despesa=?"; 
        try(PreparedStatement stm= con.prepareStatement(sql)){
        
            stm.setString(1, d.getDescricao_desp());
            stm.setDouble(2, d.getValor_desp());
            stm.setString(3, d.getDatavencimento_desp());
            stm.setString(4, d.getNumerodoc_desp());;
            stm.setInt(6, d.getId_despesa());
            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
         
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizar"+ ex.getMessage()); 
            
        }
    }
    public void deletar(Despesa d){
        Connection con = ConexaoBD.getConectarBD();
        String sql ="DELETE FROM despesa WHERE id_despesa=?"; //passar o parametro;
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir o produto"+d.getDescricao_desp()+"?", "Exclusão", JOptionPane.YES_NO_OPTION);//janela de confirmação
        if(opcao==JOptionPane.YES_OPTION){//retorna zero
            try(PreparedStatement stm = con.prepareStatement(sql)){
                stm.setInt(1,d.getId_despesa());
                stm.executeUpdate();
                stm.close();//fechou o prepared
                con.close();//fechou a conecção
                JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao Excluir"+ ex.getMessage());
                
            }
            
        }
        
    }
    public List<Despesa> listarTodos(){//REORNA UMA LISTA DO OBJETO produto
        Connection con=ConexaoBD.getConectarBD();
        List<Despesa>lista = new ArrayList<>(); //criado uma lista
        String sql = "SELECT *FROM despesa"; 
        try(PreparedStatement stm = con.prepareStatement(sql)){ //preparar a sql
            ResultSet resultado= stm.executeQuery();
            while (resultado.next()){
                Despesa d = new Despesa();
                d.setId_despesa(resultado.getInt("id_despesa"));//igual do banco 
                d.setDescricao_desp(resultado.getString("descricao_desp"));
                d.setValor_desp(resultado.getDouble("valor_desp"));
                d.setDatavencimento_desp(resultado.getString("datavencimento_desp"));
                d.setNumerodoc_desp(resultado.getString("numerodoc_desp")); 
                lista.add(d);
             }
            stm.close();
            stm.close();
       }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao retornar"+ ex.getMessage());
       }
        return lista; 
    }
    
    
}

    

