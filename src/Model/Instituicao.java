package Model;

import DAO.DoadorDAO;
import java.util.*;
import DAO.InstituicaoDAO;
import java.sql.SQLException;

public class Instituicao extends Cadastro {

    private String area;
    private String descricao;
    private final InstituicaoDAO dao;

    public Instituicao() {
        this.dao = new InstituicaoDAO();
    }

    public Instituicao(String area, String descricao) {
        this.area = area;
        this.descricao = descricao;
        this.dao = new InstituicaoDAO();
    }

    public Instituicao(String area, String descricao, int id, String nome, String endereco, String telefone) {
        super(id, nome, endereco, telefone);
        this.area = area;
        this.descricao = descricao;
        this.dao = new InstituicaoDAO();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Override necess�rio para poder retornar os dados de Pessoa no toString para instituicao.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Endereco: " + this.getEndereco()
                + "\n Telefone:" + this.getTelefone()
                + "\n Senha: " + this.getArea()
                + "\n Senha: " + this.getDescricao()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS M�TODOS PARA USO JUNTO COM O DAO
    
     */
    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    // Cadastra novo aluno
    public boolean InsertInstituicaoBD(Instituicao objeto) {
        dao.InsertInstituicaoBD(objeto);
        return true;
    }

    // Deleta um aluno espec�fico pelo seu campo ID
    public boolean DeleteInstituicaoBD(int id) {
        dao.DeleteInstituicaoBD(id);
        return true;
    }

    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateInstituicaoBD(Instituicao objeto) {
        dao.UpdateInstituicaoBD(objeto);
        return true;
    }

    // carrega dados de um aluno espec�fico pelo seu ID
    public Instituicao carregaInstituicao(int id) {
        dao.carregaInstituicao(id);
        return null;
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
}
