package paineisAbas;

import paineis.PainelCriarCadastroClientes;
import util.ValidadorLimite;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PainelDadosClientes extends javax.swing.JPanel {

    private final Long idClientes = null;
    private final PainelCriarCadastroClientes painelExterno;

    public PainelDadosClientes(PainelCriarCadastroClientes painelExterno) {
        this.painelExterno = painelExterno;
        initComponents();
        comboBoxGrupo1Clientes.setSelectedItem(null);
        comboBoxGrupo2Clientes.setSelectedItem(null);
        atualizarContagem2();

        if (idClientes == null) {
            dataLabel();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldFone2Clientes = new javax.swing.JTextField();
        textFieldCelularClientes = new javax.swing.JTextField();
        jLabelGrupo01 = new javax.swing.JLabel();
        textFieldContatoComprasClientes = new javax.swing.JTextField();
        jLabelGrupo02 = new javax.swing.JLabel();
        textFieldContatoFinanceiroClientes = new javax.swing.JTextField();
        jLabelFone01 = new javax.swing.JLabel();
        comboBoxGrupo1Clientes = new javax.swing.JComboBox<>();
        jLabelFone02 = new javax.swing.JLabel();
        comboBoxGrupo2Clientes = new javax.swing.JComboBox<>();
        jLabelCelular = new javax.swing.JLabel();
        jLabelDataCadastro = new javax.swing.JLabel();
        textFieldEnderecoClientes = new javax.swing.JTextField();
        labelDataClientes = new javax.swing.JLabel();
        textFieldBairroClientes = new javax.swing.JTextField();
        jLabelNomeFantasia = new javax.swing.JLabel();
        textFieldCidadeClientes = new javax.swing.JTextField();
        textFieldEmailClientes = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jLabelObservacoes = new javax.swing.JLabel();
        jLabelCnpjCpf = new javax.swing.JLabel();
        jTextAreaClientes = new javax.swing.JTextArea();
        jLabelContador = new javax.swing.JLabel();
        jLabelInscricaoEstadual = new javax.swing.JLabel();
        jLabelInscricaoMunicipal = new javax.swing.JLabel();
        textFieldNomeFantasiaClientes = new javax.swing.JTextField();
        textFieldRazaoSocialClientes = new javax.swing.JTextField();
        textFieldCnpjClientes = new javax.swing.JTextField();
        textFieldInscricaoEstadualClientes = new javax.swing.JTextField();
        textFieldIncricaoMunicipalClientes = new javax.swing.JTextField();
        jLabelContatoCompras = new javax.swing.JLabel();
        jLabelContatoFinanceiro = new javax.swing.JLabel();
        labelCodigoClientes = new javax.swing.JLabel();
        textFieldFone1Clientes = new javax.swing.JTextField();
        textFieldUfClientes = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelUf = new javax.swing.JLabel();
        textFieldCepClientes = new javax.swing.JTextField();
        textFieldSiteClientes = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSite = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonRedondoCriarClientesCancelar = new util.JButtonRedondoCriarForncecedores();
        jButtonRedondoCriarClientesDeletar = new util.JButtonRedondoCriarForncecedores();
        jButtonRedondoCriarClientesSalvar = new util.JButtonRedondoCriarForncecedores();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabelGrupo01.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGrupo01.setText("Grupo 1");

        jLabelGrupo02.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGrupo02.setText("Grupo 2");

        jLabelFone01.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFone01.setText("Fone 1");

        comboBoxGrupo1Clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Agências", " Atacadistas e Distribuidores ", " Clubes ", " Consultorias ", " Drogarias ", " Empresas de Terceirização ", " Eventos e Feiras ", " Fornecedores ", " Funcionários ", " Gráficas ", " Higiene e Limpeza ", " Hospitais e Clínicas ", " Igrejas ", " Indústrias ", " Instituições de Ensino ", " Interno ", " Órgãos Públicos ", " Plataforma Online ", " Políticos/Partidos ", " Saúde ", " Software ", " Supermercados ", " Transportadoras ", " Varejistas ", " Vendedores ", " Vigilancia e Segurança" }));

        jLabelFone02.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFone02.setText("Fone 2");

        comboBoxGrupo2Clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Agências", " Atacadistas e Distribuidores ", " Clubes ", " Consultorias ", " Drogarias ", " Empresas de Terceirização ", " Eventos e Feiras ", " Fornecedores ", " Funcionários ", " Gráficas ", " Higiene e Limpeza ", " Hospitais e Clínicas ", " Igrejas ", " Indústrias ", " Instituições de Ensino ", " Interno ", " Órgãos Públicos ", " Plataforma Online ", " Políticos/Partidos ", " Saúde ", " Software ", " Supermercados ", " Transportadoras ", " Varejistas ", " Vendedores ", " Vigilancia e Segurança" }));

        jLabelCelular.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCelular.setText("Celular(WhatsApp)");

        jLabelDataCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDataCadastro.setText("Data de Cadastro");

        labelDataClientes.setForeground(new java.awt.Color(0, 0, 0));
        labelDataClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDataClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelDataClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelNomeFantasia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeFantasia.setText("Nome Fantasia");

        jLabelRazaoSocial.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRazaoSocial.setText("Razão Social");

        jLabelObservacoes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelObservacoes.setText("Observações");

        jLabelCnpjCpf.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCnpjCpf.setText("Cnpj/CPF");

        jTextAreaClientes.setColumns(3);
        jTextAreaClientes.setLineWrap(true);
        jTextAreaClientes.setRows(3);
        jTextAreaClientes.setTabSize(3);
        jTextAreaClientes.setMaximumSize(new java.awt.Dimension(45, 52));
        jTextAreaClientes.setMinimumSize(new java.awt.Dimension(45, 52));
        jTextAreaClientes.setDocument(new ValidadorLimite(300));

        jLabelContador.setForeground(new java.awt.Color(0, 0, 0));
        jLabelContador.setText("(0 de 300)");

        jLabelInscricaoEstadual.setForeground(new java.awt.Color(0, 0, 0));
        jLabelInscricaoEstadual.setText("Inscrição Estadual");

        jLabelInscricaoMunicipal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelInscricaoMunicipal.setText("Inscrição Municipal");

        jLabelContatoCompras.setForeground(new java.awt.Color(0, 0, 0));
        jLabelContatoCompras.setText("Contato Compras");

        jLabelContatoFinanceiro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelContatoFinanceiro.setText("Contato Financeiro");

        labelCodigoClientes.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigoClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelCodigoClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCodigo.setText("Código:");
        jLabelCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelCep.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCep.setText("CEP");

        jLabelEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEndereco.setText("Endereço");

        jLabelBairro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBairro.setText("Bairro");

        jLabelCidade.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCidade.setText("Cidade");

        jLabelUf.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUf.setText("UF");

        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Email");

        jLabelSite.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSite.setText("Site");

        jPanelBotoes.setOpaque(false);

        jButtonRedondoCriarClientesCancelar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarClientesCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarClientesCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/cancelarAzul.png"))); // NOI18N
        jButtonRedondoCriarClientesCancelar.setText("Cancelar");
        jButtonRedondoCriarClientesCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarClientesCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarClientesCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarClientesCancelarActionPerformed(evt);
            }
        });

        jButtonRedondoCriarClientesDeletar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarClientesDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarClientesDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Deletar.png"))); // NOI18N
        jButtonRedondoCriarClientesDeletar.setText("Remover");
        jButtonRedondoCriarClientesDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarClientesDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarClientesDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarClientesDeletarActionPerformed(evt);
            }
        });

        jButtonRedondoCriarClientesSalvar.setBackground(new java.awt.Color(160, 160, 160));
        jButtonRedondoCriarClientesSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRedondoCriarClientesSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/salve.png"))); // NOI18N
        jButtonRedondoCriarClientesSalvar.setText("Salvar");
        jButtonRedondoCriarClientesSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRedondoCriarClientesSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRedondoCriarClientesSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondoCriarClientesSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRedondoCriarClientesSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351)
                .addComponent(jButtonRedondoCriarClientesCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRedondoCriarClientesDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRedondoCriarClientesSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondoCriarClientesCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondoCriarClientesDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(215, 215, 215));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(110, 110, 110));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(111, 260));

        jLabel1.setFont(new java.awt.Font("Bohgaku Shadow", 0, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/people.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(labelCodigoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDataClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxGrupo1Clientes, 0, 210, Short.MAX_VALUE)
                            .addComponent(jLabelGrupo01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxGrupo2Clientes, 0, 204, Short.MAX_VALUE)
                            .addComponent(jLabelGrupo02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNomeFantasiaClientes)
                            .addComponent(jLabelNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRazaoSocialClientes)
                            .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldCnpjClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldInscricaoEstadualClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldIncricaoMunicipalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldCepClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEnderecoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldBairroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldCidadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldUfClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelUf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFone01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldFone1Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldFone2Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFone02, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCelularClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelContatoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelContatoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldContatoComprasClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldContatoFinanceiroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldEmailClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelObservacoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelContador)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldSiteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSite, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextAreaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGrupo01, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGrupo02))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxGrupo2Clientes)
                            .addComponent(comboBoxGrupo1Clientes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jLabelCnpjCpf)
                    .addComponent(jLabelInscricaoEstadual)
                    .addComponent(jLabelInscricaoMunicipal))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldRazaoSocialClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldCnpjClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldInscricaoEstadualClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldIncricaoMunicipalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldNomeFantasiaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFone01)
                    .addComponent(jLabelFone02)
                    .addComponent(jLabelCelular)
                    .addComponent(jLabelContatoCompras)
                    .addComponent(jLabelContatoFinanceiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFone1Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCelularClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldContatoComprasClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldContatoFinanceiroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldFone2Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelUf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCepClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCidadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUfClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldBairroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEnderecoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelSite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmailClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSiteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObservacoes)
                    .addComponent(jLabelContador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRedondoCriarClientesCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarClientesCancelarActionPerformed
        chamarCancelarClientes();
    }//GEN-LAST:event_jButtonRedondoCriarClientesCancelarActionPerformed

    private void jButtonRedondoCriarClientesDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarClientesDeletarActionPerformed
        chamarExcluirClientes();
    }//GEN-LAST:event_jButtonRedondoCriarClientesDeletarActionPerformed

    private void jButtonRedondoCriarClientesSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondoCriarClientesSalvarActionPerformed
        chamarSalvarAlterarClientes();
    }//GEN-LAST:event_jButtonRedondoCriarClientesSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> comboBoxGrupo1Clientes;
    public static javax.swing.JComboBox<String> comboBoxGrupo2Clientes;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarClientesCancelar;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarClientesDeletar;
    private util.JButtonRedondoCriarForncecedores jButtonRedondoCriarClientesSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabelBairro;
    public static javax.swing.JLabel jLabelCelular;
    public static javax.swing.JLabel jLabelCep;
    public static javax.swing.JLabel jLabelCidade;
    public static javax.swing.JLabel jLabelCnpjCpf;
    public static javax.swing.JLabel jLabelCodigo;
    public static javax.swing.JLabel jLabelContador;
    public static javax.swing.JLabel jLabelContatoCompras;
    public static javax.swing.JLabel jLabelContatoFinanceiro;
    public static javax.swing.JLabel jLabelDataCadastro;
    public static javax.swing.JLabel jLabelEmail;
    public static javax.swing.JLabel jLabelEndereco;
    public static javax.swing.JLabel jLabelFone01;
    public static javax.swing.JLabel jLabelFone02;
    public static javax.swing.JLabel jLabelGrupo01;
    public static javax.swing.JLabel jLabelGrupo02;
    public static javax.swing.JLabel jLabelInscricaoEstadual;
    public static javax.swing.JLabel jLabelInscricaoMunicipal;
    public static javax.swing.JLabel jLabelNomeFantasia;
    public static javax.swing.JLabel jLabelObservacoes;
    public static javax.swing.JLabel jLabelRazaoSocial;
    public static javax.swing.JLabel jLabelSite;
    public static javax.swing.JLabel jLabelUf;
    private javax.swing.JPanel jPanelBotoes;
    public static javax.swing.JTextArea jTextAreaClientes;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JLabel labelCodigoClientes;
    public static javax.swing.JLabel labelDataClientes;
    public static javax.swing.JTextField textFieldBairroClientes;
    public static javax.swing.JTextField textFieldCelularClientes;
    public static javax.swing.JTextField textFieldCepClientes;
    public static javax.swing.JTextField textFieldCidadeClientes;
    public static javax.swing.JTextField textFieldCnpjClientes;
    public static javax.swing.JTextField textFieldContatoComprasClientes;
    public static javax.swing.JTextField textFieldContatoFinanceiroClientes;
    public static javax.swing.JTextField textFieldEmailClientes;
    public static javax.swing.JTextField textFieldEnderecoClientes;
    public static javax.swing.JTextField textFieldFone1Clientes;
    public static javax.swing.JTextField textFieldFone2Clientes;
    public static javax.swing.JTextField textFieldIncricaoMunicipalClientes;
    public static javax.swing.JTextField textFieldInscricaoEstadualClientes;
    public static javax.swing.JTextField textFieldNomeFantasiaClientes;
    public static javax.swing.JTextField textFieldRazaoSocialClientes;
    public static javax.swing.JTextField textFieldSiteClientes;
    public static javax.swing.JTextField textFieldUfClientes;
    // End of variables declaration//GEN-END:variables

    private void atualizarContagem() {
        String texto = jTextAreaClientes.getText();
        int contagem = texto.length();
        jLabelContador.setText("(" + contagem + " de 300)");
    }

    private void atualizarContagem2() {
        jTextAreaClientes.getDocument().addDocumentListener(new DocumentListener() {
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
        labelDataClientes.setText(formato.format(dataSistema));
    }

    public void chamarCancelarClientes() {
        if (painelExterno != null) {
            painelExterno.cancelarAlteraçãoClientes();
        }
    }

    public void chamarSalvarAlterarClientes() {
        if (painelExterno != null) {
            painelExterno.salvarAlterarClientes();
        }
    }

    public void chamarExcluirClientes() {
        if (painelExterno != null) {
            painelExterno.removerClientes();
        }
    }

}
