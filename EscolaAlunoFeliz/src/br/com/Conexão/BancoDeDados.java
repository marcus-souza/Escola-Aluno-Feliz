package br.com.Conexão;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.ClassesInternas.*;

public class BancoDeDados {
	public static String inserir(Aluno a){
		String sql = "insert into aluno(nome,cpf,telefone,endereço,usuario,senha) values (?,?,?,,?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getNome());
			pst.setString(2, a.getCpf());
			pst.setString(3, a.getTelefone());
			pst.setString(4, a.getEndereço());
			pst.setString(5, a.getUsuario());
			pst.setString(6, a.getSenha());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Inserido com sucesso.";
			}else{
				return "Erro ao inserir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static String inserir(Curso c){
		String sql = "insert into curso(nome) values (?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, c.getNome());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Inserido com sucesso.";
			}else{
				return "Erro ao inserir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static String inserir(Disciplina d){
		String sql = "insert into disciplina(codigo,nome,codigoProfessor) values (?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, d.getCodigo());
			pst.setString(2, d.getNome());
			pst.setString(3, d.getProfessor().getCodigo());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Inserido com sucesso.";
			}else{
				return "Erro ao inserir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static String inserir(Recado r){
		String sql = "insert into Recado(recado,data) values (?,?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, r.getRecado());
			pst.setString(2, r.getData());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Inserido com sucesso.";
			}else{
				return "Erro ao inserir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static String inserir(Professor p){
		String sql = "insert into professor (nome,cpf,telefone,endereço,usuario,senha) values (?,?,?,?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, p.getCpf());
			pst.setString(2, p.getNome());
			pst.setString(3, p.getCodigo());
			pst.setString(4, p.getEndereço());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Inserido com sucesso.";
			}else{
				return "Erro ao inserir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static String inserir(Nota nota){
		String sql = "insert into alunoDisciplina (cpfAluno,codigoDisciplina,nota) values (?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, nota.getAluno().getCpf());
			pst.setString(2, nota.getDisciplina().getCodigo());
			pst.setDouble(3, nota.getNota());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Inserido com sucesso.";
			}else{
				return "Erro ao inserir.";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static String inserir(Solicitação s){
		String sql = "insert into solicitações (tipo,data,cpfAluno,codigoDiciplina) values (?,?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getTipo());
			pst.setString(2, s.getData());
			pst.setString(3, s.getAluno().getCpf());
			pst.setString(4, s.getDisciplina().getCodigo());
			int res = pst.executeUpdate();
			if(res > 0){
				return "Foi enviado uma solicitação ao administrador do sistema para que ele te cadastre na disciplina!";
			}else{
				return "Erro ao criar solicitação!";
			}
		}catch(SQLException e){
			return e.getMessage();
		}finally {
			ConnectionFactory.close(con);
		}
	}

	public static int existeAluno(String cpfAluno) {
		String sql = "select * from aluno where cpf=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cpfAluno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) 
				return 1;
			else
				return 0;	
		} catch (SQLException e) {
				return -1;
		} finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static int existeProfessor(String codigoProfessor){
		String sql = "select * from professor where codigo=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, codigoProfessor);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) 
				return 1;
			else
				return 0;	
		} catch (SQLException e) {
				return -1;
		} finally {
			ConnectionFactory.close(con);
		}
	}
	
	public static void atualizar(Aluno a) {
		
		JOptionPane.showConfirmDialog(null, "Usuário atualizado.\nO usuario e a senha foram mudados para o padrão(nome da pessoa)!", "Usuário e senha modificados", 3);
	}
	
	public static void atualizar(Professor p) {
		
		JOptionPane.showConfirmDialog(null, "Usuário atualizado.\nO usuario e a senha foram mudados para o padrão(nome da pessoa)!", "Usuário e senha modificados", 3);
	}

	public static String excluir(Aluno a) {
		return "Excluído com sucesso!";
	}

	public static String excluir(Professor p) {
		return "Excluído com sucesso!";
	}
	
	public static ArrayList<Disciplina> getDisciplinas(Aluno a){
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		String sql = "select * from Disciplina inner join alunoDisciplina on disciplina.codigo = alunoDisciplina.codigoDisciplina where alunoDisciplina.cpf = ? ";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getCpf());
			ResultSet rs = pst.executeQuery();
			while (rs.next()){
				//TODO terminar os gets
				Disciplina d = new Disciplina(
						rs.getString(1),
						rs.getString(2),
						BancoDeDados.getProfessor(rs.getString(3)),
						BancoDeDados.getCurso(rs.getString(4)),
						rs.getInt(5)
						);
				disciplinas.add(d);
				}
		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionFactory.close(con);
		}
		return disciplinas;
	}
	
	public static Disciplina getDisciplina(String codigoDisciplina) {
		// TODO fazer método
		return null;
	}

	public static Professor getProfessor(String codigo) {
		String sql = "select * from professor where codigo = ? ";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, codigo);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				Professor p = new Professor(
					rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getDouble(5),
					rs.getString(6),
					rs.getString(7),
					rs.getString(8),
					rs.getString(9)
					);
				return p;
			}
			else
				return null;
		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionFactory.close(con);
		}
	}

	public static Professor getProfessor(String user, String senha) {
		// TODO fazer o metodo
		return null;
	}
	
	public static Aluno getAluno(String cpf) {
		//TODO não está feito
		String sql = "select * from aluno where cpf = ? ";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cpf);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				Aluno a = new Aluno(
					rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6),
					BancoDeDados.getCurso(rs.getString(7)),
					BancoDeDados.getDisciplinas(new Aluno(cpf))
					);
				return a;
			}
			else
				return null;
		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionFactory.close(con);
		}
	}

	public static Aluno getAluno(String user, String senha) {
		// TODO fazer o metodo
		return null;
	}

	public static Curso getCurso(String nomeCurso) {
		// TODO Fazer método
		return null;
	}
	
	public static ArrayList<Curso> getCursos() {
		// TODO fazer o método
		return null;
	}
	
	public static ArrayList<Recado> getRecados(Aluno aluno) {
		// TODO fazer o método
		return null;
	}

	public static ArrayList<Nota> getNotas(Aluno aluno) {
		// TODO fazer o método
		return null;
	}

	public static ArrayList<Disciplina> getDisciplinas(String nomeCurso, int semestre) {
		// TODO fazer o método que retorna as disciplinas daquele curso e semestre
		return null;
	}

	public static ArrayList<Solicitação> getSolicitações() {
		// TODO criar método
		return null;
	}

	public static boolean entrarComoAdm(String user, String senha) {
		// TODO fazer o método
		return false;
	}

}
