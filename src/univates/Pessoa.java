/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates;

/**
 *
 * @author yuri.schmitz
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String endereco;
    private int telefone;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return "\nCodigo: " + this.codigo + "\nNome: " + this.nome + "\nEndereço: " + this.endereco + 
                "\nTelefone: " + this.telefone;
    }
    
}
