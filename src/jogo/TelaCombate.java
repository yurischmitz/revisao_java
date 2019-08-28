/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import funcoes.*;

/**
 *
 * @author yuri.schmitz
 */
public class TelaCombate extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    
    Personagem personagem;
    Inimigo inimigo;
    String[] inimigos = {"Godzilla", "King Kong", "Dormamu", "Thanos"};
    int contInimigo = 0;
    
    public TelaCombate() {
        initComponents();
        
        gerarPersonagem();
        exibirPersonagem();
        gerarInimigo();
        exibirInimigo();
    }
    
    private void gerarPersonagem(){
        personagem = new Personagem();
        personagem.setNome("Moke");
        personagem.setVida(1000);
        personagem.setAtaque(15);
    }
    
    private void exibirPersonagem(){
        lblNomePersonagem.setText(personagem.getNome());
        lblVidaPersonagem.setText(String.valueOf(personagem.getVida()));
        lblAtaquePersonagem.setText(String.valueOf(personagem.getAtaque()));
    }
    
    private void exibirInimigo(){
        lblNomeInimigo.setText(inimigo.getNome());
        lblVidaInimigo.setText(String.valueOf(inimigo.getVida()));
        lblAtaqueInimigo.setText(String.valueOf(inimigo.getAtaque()));
    }
    
    private void gerarInimigo(){
        
        try{
        inimigo = new Inimigo();
        inimigo.setNome(inimigos[contInimigo]);
        inimigo.setVida(200);
        inimigo.setAtaque(20);
        
        if(contInimigo < inimigos.length){
            contInimigo += 1;
        }else{
            contInimigo = 0;
        }
        }catch(Exception e){
            boolean resposta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Deseja Jogar Novamente?", "VOCÊ GANHOU!!!", 'p');
            if(resposta){
                gerarPersonagem();
                contInimigo = 0;
                gerarInimigo();
            }else{
                System.exit(0);
            }
        }
    }
    
    private void validarAtaque(){
        if (personagem.getAtaque() <= 0){
            CaixaDeDialogo.obterinstancia().exibirMensagem("O inimigo tirou todo seu ataque."
                    + " Você acaba de ganhar 15 pontos de poder para continuar a luta", 'i');
            personagem.setAtaque(15);

        }else if(inimigo.getAtaque() <= 0){
            CaixaDeDialogo.obterinstancia().exibirMensagem("O Personagem tirou todo seu ataque."
                    + " Você acaba de ganhar 15 pontos de poder para continuar a luta", 'i');
            personagem.setAtaque(15);
        }
    }
    
    private void atacar(){
        int ataque = personagem.getAtaque();
        int vida = inimigo.getVida();
        /*
        1,2 = ataque normal do inimigo
        3 = ataque poderoso do inimigo
        4 = ataque normal
        5 = ataque + 10%
        6 = ataque * 2
        7 = ataque atorduante do personagem
        8 = jogadores ganham vida
        */
        int dado = Funcoes.sortearNumero(8);
        lblDado.setText("Dado caiu na posição " + dado);
        if(dado == 1 || dado == 2){//ataque normal do inimigo
                personagem.setVida(personagem.getVida() - inimigo.getAtaque());
                lblNomeAtacante.setText("Atacante: " + inimigo.getNome());
                lblTipoAtaque.setText("Ataque normal, tirando " + inimigo.getAtaque() + " de vida");
        }else if(dado == 3){//ataque poderoso do inimigo
                personagem.setVida(personagem.getVida() - (inimigo.getAtaque() * 3));
                lblNomeAtacante.setText("Atacante: " + inimigo.getNome());
                lblTipoAtaque.setText("Ataque poderoso, tirando " + inimigo.getAtaque() * 3 + " de vida");
                inimigo.setAtaque((int) (inimigo.getAtaque() * 1.1));
                personagem.setAtaque(personagem.getAtaque() - 1);
                validarAtaque();
        }else if(dado == 4){//ataque normal
                inimigo.setVida(inimigo.getVida() - ataque);
                lblNomeAtacante.setText("Atacante: " + personagem.getNome());
                lblTipoAtaque.setText("Ataque normal, tirando " + ataque + " de vida");
        }else if(dado == 5){//10 % a mais
                vida = (int) (inimigo.getVida() - (ataque * 1.1));
                inimigo.setVida(vida);
                lblNomeAtacante.setText("Atacante: " + personagem.getNome());
                lblTipoAtaque.setText("Ataque com 10%, tirando " + (int)(ataque * 1.1) + " de vida");
        }else if(dado == 6){//ataque x2
                inimigo.setVida(inimigo.getVida() - (ataque * 2));
                lblNomeAtacante.setText("Atacante: " + personagem.getNome());
                lblTipoAtaque.setText("Ataque x2, tirando " + ataque * 2 + " de vida");
                personagem.setAtaque((int) (ataque * 1.2));
        }else if(dado == 7){//ataque atorduante do personagem
                inimigo.setVida(inimigo.getVida() - (inimigo.getAtaque() * 3));
                lblNomeAtacante.setText("Atacante: " + personagem.getNome());
                lblTipoAtaque.setText("Ataque atorduante, tirando " + personagem.getAtaque() * 3 + " de vida");
                inimigo.setAtaque(inimigo.getAtaque() - 1);
                validarAtaque();
        }else{
                personagem.setVida(personagem.getVida() + 50);
                inimigo.setVida(inimigo.getVida() + 50);
                lblNomeAtacante.setText(personagem.getNome() + " e " + inimigo.getNome());
                lblTipoAtaque.setText("Ganharam 50 de vida cada");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonagem = new javax.swing.JLabel();
        lblVidaAtual = new javax.swing.JLabel();
        lblAtaque = new javax.swing.JLabel();
        lblOponente = new javax.swing.JLabel();
        lblVidaAtual2 = new javax.swing.JLabel();
        lblAtaque2 = new javax.swing.JLabel();
        lblNomePersonagem = new javax.swing.JLabel();
        lblVidaPersonagem = new javax.swing.JLabel();
        lblAtaquePersonagem = new javax.swing.JLabel();
        lblNomeInimigo = new javax.swing.JLabel();
        lblVidaInimigo = new javax.swing.JLabel();
        lblAtaqueInimigo = new javax.swing.JLabel();
        btnAtaque = new javax.swing.JButton();
        lblNomeAtacante = new javax.swing.JLabel();
        lblTipoAtaque = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        lblDado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPersonagem.setText("Personagem:");
        getContentPane().add(lblPersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblVidaAtual.setText("Vida Atual:");
        getContentPane().add(lblVidaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblAtaque.setText("Ataque:");
        getContentPane().add(lblAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblOponente.setText("Oponente:");
        getContentPane().add(lblOponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        lblVidaAtual2.setText("Vida Atual:");
        getContentPane().add(lblVidaAtual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        lblAtaque2.setText("Ataque:");
        getContentPane().add(lblAtaque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        lblNomePersonagem.setText("...");
        getContentPane().add(lblNomePersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblVidaPersonagem.setText("...");
        getContentPane().add(lblVidaPersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblAtaquePersonagem.setText("...");
        getContentPane().add(lblAtaquePersonagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblNomeInimigo.setText("...");
        getContentPane().add(lblNomeInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        lblVidaInimigo.setText("...");
        getContentPane().add(lblVidaInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        lblAtaqueInimigo.setText("...");
        getContentPane().add(lblAtaqueInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnAtaque.setText("Ataque");
        btnAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueActionPerformed(evt);
            }
        });
        btnAtaque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnAtaqueKeyReleased(evt);
            }
        });
        getContentPane().add(btnAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        lblNomeAtacante.setText("...");
        getContentPane().add(lblNomeAtacante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, -1));

        lblTipoAtaque.setText("...");
        getContentPane().add(lblTipoAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, -1));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, -1));
        getContentPane().add(lblDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 20));

        setSize(new java.awt.Dimension(451, 289));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueActionPerformed
        // TODO add your handling code here:
        atacar();
        btnAtaque.grabFocus();
        
        if(personagem.getVida() <= 0){ //VERIFICA SE PRECISA O PERSONAGEM MORREU
            boolean resposta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Você perdeu, Deseja Sair?", "GAME OVER!!!", 'p');
            if(resposta){
                System.exit(0);
            }else{
                gerarPersonagem();
                contInimigo = 0;
                gerarInimigo();
            }
        }
        
        if(inimigo.getVida() <= 0){ //VERIFICA SE PRECISA GERAR OUTRO INIMIGO
            CaixaDeDialogo.obterinstancia().exibirMensagem("Inimigo derrotado, PARABÉNS!!!", 'i');
            gerarInimigo();
        }
        
        exibirPersonagem();
        exibirInimigo();
    }//GEN-LAST:event_btnAtaqueActionPerformed

    private void btnAtaqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAtaqueKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtaqueKeyReleased

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        gerarPersonagem();
        contInimigo = 0;
        gerarInimigo();
        exibirPersonagem();
        exibirInimigo();
        lblNomeAtacante.setText("...");
        lblTipoAtaque.setText("...");
        lblDado.setText("");
                
    }//GEN-LAST:event_btnReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaque;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblAtaque2;
    private javax.swing.JLabel lblAtaqueInimigo;
    private javax.swing.JLabel lblAtaquePersonagem;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblNomeAtacante;
    private javax.swing.JLabel lblNomeInimigo;
    private javax.swing.JLabel lblNomePersonagem;
    private javax.swing.JLabel lblOponente;
    private javax.swing.JLabel lblPersonagem;
    private javax.swing.JLabel lblTipoAtaque;
    private javax.swing.JLabel lblVidaAtual;
    private javax.swing.JLabel lblVidaAtual2;
    private javax.swing.JLabel lblVidaInimigo;
    private javax.swing.JLabel lblVidaPersonagem;
    // End of variables declaration//GEN-END:variables
}
