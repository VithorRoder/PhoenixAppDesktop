package paineis;

import util.ValidadorLimite;
import controller.FornecedoresController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Fornecedores;
import application.ApplicationFrame;

public class PainelCriarCadastroFornecedores extends javax.swing.JPanel {

    private final Long idFornecedores = null;

    public PainelCriarCadastroFornecedores() {
        initComponents();

        comboBoxTipoFornecedores.setSelectedItem(null);
        comboBoxGrupo1Fornecedores.setSelectedItem(null);
        comboBoxGrupo2Fornecedores.setSelectedItem(null);

        atualizarContagem2();

        if (idFornecedores == null) {
            dataLabel();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodigoFornecedores = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBoxTipoFornecedores = new javax.swing.JComboBox<>();
        comboBoxGrupo1Fornecedores = new javax.swing.JComboBox<>();
        comboBoxGrupo2Fornecedores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        labelDataFornecedores = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textFieldNomeFantasiaFornecedores = new javax.swing.JTextField();
        textFieldRazaoSocialFornecedores = new javax.swing.JTextField();
        textFieldCnpjFornecedores = new javax.swing.JTextField();
        textFieldInscricaoEstadualFornecedores = new javax.swing.JTextField();
        textFieldIncricaoMunicipalFornecedores = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textFieldFone1Fornecedores = new javax.swing.JTextField();
        textFieldFone2Fornecedores = new javax.swing.JTextField();
        textFieldCelularFornecedores = new javax.swing.JTextField();
        textFieldContatoComprasFornecedores = new javax.swing.JTextField();
        textFieldContatoFinanceiroFornecedores = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textFieldEnderecoFornecedores = new javax.swing.JTextField();
        textFieldBairroFornecedores = new javax.swing.JTextField();
        textFieldCidadeFornecedores = new javax.swing.JTextField();
        textFieldUfFornecedores = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        textFieldCepFornecedores = new javax.swing.JTextField();
        textFieldSiteFornecedores = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        textFieldEmailFornecedores = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextAreaThorvi = new javax.swing.JTextArea();
        jLabelContador = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonRedondoCriarForncecedoresCancelar = new util.JButtonRedondoCriarForncecedores();
        jButtonRedondoCriarForncecedoresDeletar = new util.JButtonRedondoCriarForncecedores();
        jButtonRedondoCriarForncecedoresSalvar = new util.JButtonRedondoCriarForncecedores();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        labelCodigoFornecedores.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigoFornecedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelCodigoFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Código:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tipo");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Grupo 1");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Grupo 2");

        comboBoxTipoFornecedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fornecedor", "Vendedor", "Agência", "Outros" }));

        comboBoxGrupo1Fornecedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agências", "Associações", "Clientes", "Comércio", "Contabilidade", "Especiais", "Funcionários", "Indústrias", "Papéis/Bobinas", "Prestadores de Serviço", "Telefonia", "Ti e Software", "Tintas/Vernizes", "Transportadoras", "Vendedores" }));

        comboBoxGrupo2Fornecedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agências", "Associações", "Clientes", "Comércio", "Contabilidade", "Especiais", "Funcionários", "Indústrias", "Papéis/Bobinas", "Prestadores de Serviço", "Telefonia", "Ti e Software", "Tintas/Vernizes", "Transportadoras", "Vendedores" }));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data de Cadastro");

        labelDataFornecedores.setForeground(new java.awt.Color(0, 0, 0));
        labelDataFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataFornecedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelDataFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome Fantasia");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Razão Social");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cnpj");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Inscrição Estadual");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Inscrição Municipal");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Contato Compras");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Contato Financeiro");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Fone 1");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Fone 2");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Celular(WhatsApp)");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("CEP");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Endereço");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Bairro");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Cidade");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("UF");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Email");

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Site");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Observações");

        jTextAreaThorvi.setColumns(3);
        jTextAreaThorvi.setLineWrap(true);
        jTextAreaThorvi.setRows(3);
        jTextAreaThorvi.setTabSize(3);
        jTextAreaThorvi.setMaximumSize(new java.awt.Dimension(45, 52));
        jTextAreaThorvi.setMinimumSize(new java.awt.Dimension(45, 52));
        jTextAreaThorvi.setDocument(new ValidadorLimite(300));

        jLabelContador.setForeground(new java.awt.Color(0, 0, 0));
        jLabelContador.setText("(0 de 300)");

        jPanel1.setOpaque(false);

        jButtonRedondoCriarForncecedoresCancelar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/cancelarAzul.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresCancelar.setText("Cancelar");
        jButtonRedondoCriarForncecedoresCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarForncecedoresCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarForncecedoresCancelarActionPerformed(evt);
            }
        });

        jButtonRedondoCriarForncecedoresDeletar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Deletar.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresDeletar.setText("Remover");
        jButtonRedondoCriarForncecedoresDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarForncecedoresDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarForncecedoresDeletarActionPerformed(evt);
            }
        });

        jButtonRedondoCriarForncecedoresSalvar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarForncecedoresSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarForncecedoresSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/salve.png"))); // NOI18N
        jButtonRedondoCriarForncecedoresSalvar.setText("Salvar");
        jButtonRedondoCriarForncecedoresSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarForncecedoresSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarForncecedoresSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarForncecedoresSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRedondoCriarForncecedoresSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353)
                .addComponent(jButtonRedondoCriarForncecedoresCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRedondoCriarForncecedoresDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRedondoCriarForncecedoresSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondoCriarForncecedoresCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondoCriarForncecedoresDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(215, 215, 215));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(110, 110, 110));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(111, 264));

        jLabel1.setFont(new java.awt.Font("Bohgaku Shadow", 0, 90)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("F");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/agreement.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCodigoFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDataFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(comboBoxTipoFornecedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxGrupo1Fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxGrupo2Fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNomeFantasiaFornecedores)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRazaoSocialFornecedores)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldCnpjFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldInscricaoEstadualFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldIncricaoMunicipalFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldCepFornecedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEnderecoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldBairroFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldCidadeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldUfFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldFone1Fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldFone2Fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCelularFornecedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldContatoComprasFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldContatoFinanceiroFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldEmailFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelContador)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldSiteFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextAreaThorvi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxGrupo2Fornecedores)
                            .addComponent(comboBoxTipoFornecedores)
                            .addComponent(comboBoxGrupo1Fornecedores)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldRazaoSocialFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldCnpjFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldInscricaoEstadualFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldIncricaoMunicipalFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldNomeFantasiaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFone1Fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCelularFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldContatoComprasFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldContatoFinanceiroFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFone2Fornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCepFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCidadeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUfFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldBairroFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEnderecoFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmailFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSiteFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabelContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaThorvi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRedondoCriarForncecedoresDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarForncecedoresDeletarActionPerformed
        removerFornecedores();
    }//GEN-LAST:event_jButtonRedondoCriarForncecedoresDeletarActionPerformed

    private void jButtonRedondoCriarForncecedoresCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarForncecedoresCancelarActionPerformed
        cancelarAlteraçãoFornecedores();
    }//GEN-LAST:event_jButtonRedondoCriarForncecedoresCancelarActionPerformed

    private void jButtonRedondoCriarForncecedoresSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarForncecedoresSalvarActionPerformed
        salvarAlterarFornecedores();
    }//GEN-LAST:event_jButtonRedondoCriarForncecedoresSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> comboBoxGrupo1Fornecedores;
    public static javax.swing.JComboBox<String> comboBoxGrupo2Fornecedores;
    public static javax.swing.JComboBox<String> comboBoxTipoFornecedores;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresCancelar;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresDeletar;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarForncecedoresSalvar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelContador;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextArea jTextAreaThorvi;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JLabel labelCodigoFornecedores;
    public static javax.swing.JLabel labelDataFornecedores;
    public static javax.swing.JTextField textFieldBairroFornecedores;
    public static javax.swing.JTextField textFieldCelularFornecedores;
    public static javax.swing.JTextField textFieldCepFornecedores;
    public static javax.swing.JTextField textFieldCidadeFornecedores;
    public static javax.swing.JTextField textFieldCnpjFornecedores;
    public static javax.swing.JTextField textFieldContatoComprasFornecedores;
    public static javax.swing.JTextField textFieldContatoFinanceiroFornecedores;
    public static javax.swing.JTextField textFieldEmailFornecedores;
    public static javax.swing.JTextField textFieldEnderecoFornecedores;
    public static javax.swing.JTextField textFieldFone1Fornecedores;
    public static javax.swing.JTextField textFieldFone2Fornecedores;
    public static javax.swing.JTextField textFieldIncricaoMunicipalFornecedores;
    public static javax.swing.JTextField textFieldInscricaoEstadualFornecedores;
    public static javax.swing.JTextField textFieldNomeFantasiaFornecedores;
    public static javax.swing.JTextField textFieldRazaoSocialFornecedores;
    public static javax.swing.JTextField textFieldSiteFornecedores;
    public static javax.swing.JTextField textFieldUfFornecedores;
    // End of variables declaration//GEN-END:variables

    private void atualizarContagem() {
        String texto = jTextAreaThorvi.getText();
        int contagem = texto.length();
        jLabelContador.setText("(" + contagem + " de 300)");
    }

    public final void atualizarContagem2() {
        jTextAreaThorvi.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                atualizarContagem();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                atualizarContagem();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                atualizarContagem();
            }
        });
    }

    private void dataLabel() {
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        labelDataFornecedores.setText(formato.format(dataSistema));
    }

    private void salvarAlterarFornecedores() {

        Fornecedores fornecedores = new Fornecedores();

        String itemSelecionadoTipo = comboBoxTipoFornecedores.getSelectedItem() != null ? comboBoxTipoFornecedores.getSelectedItem().toString() : "";
        String itemSelecionadoGrupo1 = comboBoxGrupo1Fornecedores.getSelectedItem() != null ? comboBoxGrupo1Fornecedores.getSelectedItem().toString() : "";
        String itemSelecionadoGrupo2 = comboBoxGrupo2Fornecedores.getSelectedItem() != null ? comboBoxGrupo2Fornecedores.getSelectedItem().toString() : "";

        if (labelDataFornecedores.getText().length() > 0
                && itemSelecionadoTipo.length() > 0
                && itemSelecionadoGrupo1.length() > 0
                && itemSelecionadoGrupo2.length() > 0
                && textFieldNomeFantasiaFornecedores.getText().length() > 0
                && textFieldRazaoSocialFornecedores.getText().length() > 0
                && textFieldCnpjFornecedores.getText().length() > 0
                && textFieldInscricaoEstadualFornecedores.getText().length() > 0
                && textFieldIncricaoMunicipalFornecedores.getText().length() > 0
                && textFieldFone1Fornecedores.getText().length() > 0
                && textFieldFone2Fornecedores.getText().length() > 0
                && textFieldCelularFornecedores.getText().length() > 0
                && textFieldContatoComprasFornecedores.getText().length() > 0
                && textFieldContatoFinanceiroFornecedores.getText().length() > 0
                && textFieldCepFornecedores.getText().length() > 0
                && textFieldEnderecoFornecedores.getText().length() > 0
                && textFieldBairroFornecedores.getText().length() > 0
                && textFieldCidadeFornecedores.getText().length() > 0
                && textFieldUfFornecedores.getText().length() > 0
                && textFieldEmailFornecedores.getText().length() > 0
                && textFieldSiteFornecedores.getText().length() > 0
                && jTextAreaThorvi.getText().length() > 0) {

            fornecedores.setDataCadastroFornecedores(labelDataFornecedores.getText());
            fornecedores.setTipoFornecedores(itemSelecionadoTipo);
            fornecedores.setGrupo1Fornecedores(itemSelecionadoGrupo1);
            fornecedores.setGrupo2Fornecedores(itemSelecionadoGrupo2);
            fornecedores.setNomeFantasiaFornecedores(textFieldNomeFantasiaFornecedores.getText());
            fornecedores.setRazaoSocialFornecedores(textFieldRazaoSocialFornecedores.getText());
            fornecedores.setCnpjFornecedores(textFieldCnpjFornecedores.getText());
            fornecedores.setInscricaoEstadualFornecedores(textFieldInscricaoEstadualFornecedores.getText());
            fornecedores.setInscricaoMunicipalFornecedores(textFieldIncricaoMunicipalFornecedores.getText());
            fornecedores.setFone1Fornecedores(textFieldFone1Fornecedores.getText());
            fornecedores.setFone2Fornecedores(textFieldFone2Fornecedores.getText());
            fornecedores.setCelularFornecedores(textFieldCelularFornecedores.getText());
            fornecedores.setContatoComprasFornecedores(textFieldContatoComprasFornecedores.getText());
            fornecedores.setContatoFinanceiroFornecedores(textFieldContatoFinanceiroFornecedores.getText());
            fornecedores.setCepFornecedores(textFieldCepFornecedores.getText());
            fornecedores.setEnderecoFornecedores(textFieldEnderecoFornecedores.getText());
            fornecedores.setBairroFornecedores(textFieldBairroFornecedores.getText());
            fornecedores.setCidadeFornecedores(textFieldCidadeFornecedores.getText());
            fornecedores.setUfFornecedores(textFieldUfFornecedores.getText());
            fornecedores.setEmailFornecedores(textFieldEmailFornecedores.getText());
            fornecedores.setSiteFornecedores(textFieldSiteFornecedores.getText());
            fornecedores.setObservacoesFornecedores(jTextAreaThorvi.getText());

        } else {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!", "Código Vazio", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ler o ID do campo labelCodigoFornecedores
        Long idFornecedores = null;
        String idTexto = labelCodigoFornecedores.getText();
        if (!idTexto.isEmpty()) {
            try {
                idFornecedores = Long.parseLong(idTexto);
            } catch (NumberFormatException e) {

            }
        }

        int result = 0;

        if (idFornecedores == null) {
            result = new FornecedoresController().addFornecedores(fornecedores);
            JOptionPane.showMessageDialog(this, result == 1 ? "Valor inserido com sucesso!" : "Falha ao inserir valor!");

            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaFornecedores();
        } else {
            fornecedores.setIdFornecedores(idFornecedores);
            result = new FornecedoresController().alterarFornecedores(fornecedores);
            JOptionPane.showMessageDialog(this, result == 1 ? "Valor Alterado Com Sucesso!" : "Falha ao alterar valor!");
            idFornecedores = null;

            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaFornecedores();
        }

    }

    private void removerFornecedores() {

        // Ler o ID do campo labelCodigoFornecedores
        Long idFornecedores = null;
        String idTexto = labelCodigoFornecedores.getText();
        if (!idTexto.isEmpty()) {
            try {
                idFornecedores = Long.parseLong(idTexto);
            } catch (NumberFormatException e) {

            }
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?", "Excluir Cadastro de Fornecedor", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (idFornecedores != null) {
                new FornecedoresController().excluirFornecedores(idFornecedores);
                JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
                ApplicationFrame.tabbedPaneCustom1.remove(this);
                ApplicationFrame.showPainelListaFornecedores();
            } else {
                JOptionPane.showMessageDialog(this, "Código do Fornecedor é Nulo !", "Código Vazio", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cancelarAlteraçãoFornecedores() {

        int opcao = JOptionPane.showConfirmDialog(this, "Deseja Cancelar Inserção/Alteração de Fornecedores ?", "Cancelar Alteração", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            ApplicationFrame.tabbedPaneCustom1.remove(this);
            ApplicationFrame.showPainelListaFornecedores();
        }
    }

}
