package br2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CandidatDao implements CandidatInterface {
	
	public void Read(Candidat candidat) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			String sql = "Select * from candidat";

			Connexion conn = new Connexion();

			Statement stat = (Statement) conn.connect().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				
				candidat.setId(ResSet.getString("Id"));
				candidat.setNom(ResSet.getString("Nom"));
				candidat.setPrenom(ResSet.getString("Prenom"));
				candidat.setEmail(ResSet.getString("Email"));
				candidat.setAdresse(ResSet.getString("Adresse"));
				candidat.setVille(ResSet.getString("Ville"));
				
				System.out.println(candidat.toString());
				
			}
			ResSet.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Create(Candidat candidat) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			Connexion conn = new Connexion();
			
			PreparedStatement ps = conn.connect().prepareStatement("Insert into candidat values (?,?,?,?,?,?)");
			 
			ps.setString(1, candidat.getId());
			ps.setString(2, candidat.getNom());
			ps.setString(3, candidat.getPrenom());
			ps.setString(4, candidat.getEmail());
			ps.setString(5, candidat.getAdresse());
			ps.setString(6, candidat.getVille());

			ps.execute();

			conn.connect().commit();
			ps.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Update(Candidat candidat) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Connexion conn = new Connexion();
			
			String sql = "UPDATE candidat SET Nom = '"+ candidat.getNom() +"',Prenom = '"+ candidat.getPrenom() +"',Email = '" + candidat.getEmail() + "',"
					+ "Adresse = '"+ candidat.getAdresse() +"',Ville = '"+ candidat.getVille() + "' "
							+ "WHERE Id = '" + candidat.getId() + "'";
			
			
			PreparedStatement ps = conn.connect().prepareStatement(sql);

			ps.execute();

			conn.connect().commit();
			ps.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Delete(Candidat candidat) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Connexion conn = new Connexion();
			
			String sql = "DELETE FROM candidat WHERE Id = '" + candidat.getId() + "'";

			PreparedStatement ps = conn.connect().prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	}
