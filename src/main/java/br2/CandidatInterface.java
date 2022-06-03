package br2;

import java.sql.SQLException;

public interface CandidatInterface {
	//void addCandidat(Candidat candidat);
	
	public void Create (Candidat candidat) throws SQLException;
	public void Read (Candidat candidat) throws SQLException;
	public void Update (Candidat candidat) throws SQLException;
	public void Delete (Candidat candidat) throws SQLException;
	
}
