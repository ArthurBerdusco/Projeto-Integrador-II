package com.senac.toystore.utils;

import com.senac.toystore.DAO.ClienteDAO;
import com.senac.toystore.model.Cliente;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validador {

    public ArrayList<String> mensagemErro = new ArrayList<>();

    public void pintarBordaVermelho(JTextField campo) {
        campo.setBorder(BorderFactory.createLineBorder(Color.red));
    }

    public void pintarBordaVermelho(JDateChooser campo) {
        campo.setBorder(BorderFactory.createLineBorder(Color.red));
    }

    public void pintarBordaCinza(JTextField campo) {
        Color corpersonalizada = new Color(190, 204, 200);
        campo.setBorder(BorderFactory.createLineBorder(corpersonalizada));
    }

    public void pintarBordaCinza(JDateChooser campo) {
        Color corpersonalizada = new Color(190, 204, 200);
        campo.setBorder(BorderFactory.createLineBorder(corpersonalizada));
    }

    public void validarNome(JTextField nome) {
        try {
            if (nome.getText().trim().isEmpty()) {
                throw new Exception("Nome inválido");
            }

            String[] partesNome = nome.getText().split(" ");

            if (partesNome.length < 2) {
                throw new Exception("Por favor digite o nome completo");
            }

            for (String parte : partesNome) {
                if (!parte.matches("\\p{L}+")) {
                    throw new Exception("Por favor digite apenas letras no nome");
                }
            }

            pintarBordaCinza(nome);
        } catch (Exception e) {
            pintarBordaVermelho(nome);
            mensagemErro.add(e.getMessage());
        }

    }

    public void validarString(JTextField txt) {
        try {
            if (txt.getText().trim().isEmpty()) {
                throw new Exception("O campo " + txt.getName() + " é obrigatório.");
            }
            pintarBordaCinza(txt);
        } catch (Exception ex) {
            pintarBordaVermelho(txt);
            this.mensagemErro.add(ex.getMessage());
        }
    }

    public void validarNumero(JTextField txt) {
        try {
            Integer.parseInt(txt.getText().trim());
            if(txt.getText().trim().isEmpty()){
             throw new Exception("Campo número é obrigatório");   
            }
            pintarBordaCinza(txt);
        } catch (NumberFormatException ex) {
            pintarBordaVermelho(txt);
            this.mensagemErro.add("Campo número do endereço aceita apenas números");
        } catch (Exception ex) {
            pintarBordaVermelho(txt);
            this.mensagemErro.add(ex.getMessage());
        }
    }

    public void validarCpf(JFormattedTextField cpf, Cliente cliente) {
        try {

            if (cpf.getText().trim().replace("-", "").replace(".", "").isEmpty()) {
                throw new Exception("Preencha o campo cpf");
            }

            String cpfSemFormatacao = cpf.getText().trim().replace("-", "").replace(".", "");
            if (ClienteDAO.consultarCpfCadastrado(cpfSemFormatacao)) {

                //Caso seja cliente novo já gera a excessão
                if (cliente.getCpf() == null) {
                    throw new Exception("Cliente novo: Já existe um cliente cadastrado com este CPF");
                }

                //Caso o cliente já tenha cadastro e esteja tentando inserir um cpf que já esta cadastrado
                if (!(cliente.getCpf().equals(cpfSemFormatacao))) {
                    throw new Exception("Já existe um cliente cadastrado com este CPF");
                }
            }
            pintarBordaCinza(cpf);
        } catch (Exception e) {
            pintarBordaVermelho(cpf);
            this.mensagemErro.add(e.getMessage());
        }
    }

    public void validarGroupRadio(ButtonGroup btg) {
        try {
            if (btg.getSelection() == null) {
                throw new NullPointerException("Selecione o sexo do cliente!");
            }
        } catch (NullPointerException e) {
            this.mensagemErro.add(e.getMessage());
        } catch (Exception e) {
            this.mensagemErro.add(e.getMessage());
        }
    }

    public void validarData(JDateChooser dc) {
        try {
            Date dataSelecionada = dc.getDate();
            Date dataAtual = new Date();

            if (dataSelecionada.after(dataAtual) || dataSelecionada == null) {
                throw new Exception("Data de nascimento incorreta");
            }
            pintarBordaCinza(dc);
        } catch (Exception e) {
            pintarBordaVermelho(dc);
            this.mensagemErro.add(e.getMessage());
        }
    }

    public void validarDataNasc(JDateChooser dc) {
        try {
            Date dataSelecionada = dc.getDate();
            Date dataAtual = new Date();

            if (dataSelecionada.after(dataAtual) || dataSelecionada == null) {
                throw new Exception("Data de nascimento incorreta");
            }
            pintarBordaCinza(dc);
        } catch (Exception e) {
            pintarBordaVermelho(dc);
            this.mensagemErro.add(e.getMessage());
        }
    }

    public void validarTelefone(JFormattedTextField telefone) {
        try {
            if (telefone.getText().replace("(  )", "").replace("-", "").trim().isEmpty()) {
                throw new Exception("Preencha o campo telefone!");
            }
            pintarBordaCinza(telefone);
        } catch (Exception e) {
            pintarBordaVermelho(telefone);
            this.mensagemErro.add(e.getMessage());
        }
    }

    public void validarEmail(JTextField email) {
        try {
            if ((email.getText().length() < 10) || !(email.getText().contains("@")) || !(email.getText().contains(".com"))) {
                throw new Exception("Email inválido!");
            }
            pintarBordaCinza(email);
        } catch (Exception e) {
            pintarBordaVermelho(email);
            mensagemErro.add(e.getMessage());
        }
    }

    public void validarID(JTextField id) {
        try {
            if (id.getText().trim().isEmpty()) {
                throw new Exception("Id não pode ser nulo, tente novamente.");
            }
            pintarBordaCinza(id);
        } catch (Exception e) {
            pintarBordaVermelho(id);
            mensagemErro.add(e.getMessage());
        }
    }

    public void validarDinheiro(JTextField dinheiro) {
        try {
            if (dinheiro.getText().replace(".", "").replace("R$", "").replace(",", "").trim().isEmpty()) {
                throw new Exception("Valor do produto inválido");
            }
            pintarBordaCinza(dinheiro);
        } catch (Exception e) {
            pintarBordaVermelho(dinheiro);
            mensagemErro.add(e.getMessage());
        }
    }

    public void validarComboBox(JComboBox box) {
        try {
            if (box.getSelectedIndex() == 0) {
                throw new Exception("Preencha a seleção " + box.getName());
            }
            Color cinza = new Color(140, 140, 140);
            box.setBorder(BorderFactory.createLineBorder(cinza));
        } catch (Exception e) {
            box.setBorder(BorderFactory.createLineBorder(Color.red));
            mensagemErro.add(e.getMessage());
        }
    }

    public void validarDescProd(JTextField descProd) {
        try {
            if (descProd.getText().trim().isEmpty()) {
                throw new NullPointerException("Preencha o campo descrição do produto");
            }
            pintarBordaCinza(descProd);

        } catch (Exception e) {
            pintarBordaVermelho(descProd);
            mensagemErro.add(e.getMessage());
        }
    }

    public void validarSenha(JPasswordField senha, JPasswordField cnfSenha) {
        try {
            char[] novaSenha = senha.getPassword();
            String senhaConvertida = String.valueOf(novaSenha);

            char[] novacnfSenha = cnfSenha.getPassword();
            String novasenhaConvertida = String.valueOf(novacnfSenha);

            if (novaSenha.length == 0 || novacnfSenha.length == 0) {
                JOptionPane.showMessageDialog(senha, "Digite e confirme a senha");
                senha.setBorder(BorderFactory.createLineBorder(Color.RED));
                cnfSenha.setBorder(BorderFactory.createLineBorder(Color.RED));
                return;
            }

            if (!String.valueOf(senhaConvertida).equals(String.valueOf(novasenhaConvertida))) {
                senha.setBorder(BorderFactory.createLineBorder(Color.RED));
                cnfSenha.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(senha, "As senhas não são iguais");
            } else {
                senha.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                cnfSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(senha, e.getMessage());
        }
    }
}
