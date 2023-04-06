package com.senac.utils;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Validador {

    public ArrayList<String> mensagemErro = new ArrayList<>();

    public void pintarBordaVermelho(JTextField campo) {
        campo.setBorder(BorderFactory.createLineBorder(Color.red));
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
                if (!parte.matches("[a-zA-Z]+")) {
                    throw new Exception("Por favor digite apenas letras no nome");
                }
            }

        } catch (Exception e) {
            pintarBordaVermelho(nome);
            mensagemErro.add(e.getMessage());
        }

    }

    public void validarString(JTextField txt) {
        try {
            if (txt.getText().trim().isEmpty()) {
                pintarBordaVermelho(txt);
                throw new IllegalArgumentException();
            }

        } catch (NumberFormatException ex) {
            this.mensagemErro.add("Falha ao converter o valor do campo " + txt.getName() + " em inteiro");
        } catch (IllegalArgumentException ex) {
            this.mensagemErro.add("Digite um valor para o campo " + txt.getName());
        } catch (Exception ex) {
            this.mensagemErro.add("Erro no preenchimento do campo");
        }
    }

    public void validarCpf(JFormattedTextField cpf) {
        try {
            if (cpf.getText().replace(".", "").replace("-", "").trim().isEmpty()) {
                throw new Exception("Preencha o campo CPF!");
            }

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
            e.printStackTrace();
            this.mensagemErro.add(e.getMessage());
        }
    }

    public void validarDataNasc(JFormattedTextField dataFld) {
        try {
            String data = dataFld.getText().replace("/", "");
            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(2, 4));
            int ano = Integer.parseInt(data.substring(4, 8));

            if ((dia > 31) || (dia < 1)) {
                throw new Exception("Confira o dia de nascimento!");
            }

            if ((mes > 12) || (mes < 1)) {
                throw new Exception("Confira o mes de nascimento!");
            }

            if ((ano > 2023) || (ano < 1900)) {
                throw new Exception("Confira o ano de nascimento!");
            }
        } catch (Exception e) {
            pintarBordaVermelho(dataFld);
            this.mensagemErro.add(e.getMessage());
        }

    }

    public void validarTelefone(JFormattedTextField telefone) {
        try {
            if (telefone.getText().replace("(  )", "").replace("-", "").trim().isEmpty()) {
                throw new Exception("Preencha o campo telefone!");
            }
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
        } catch (Exception e) {
            pintarBordaVermelho(id);
            mensagemErro.add(e.getMessage());
        }
    }

    public void validarDinheiro(JFormattedTextField dinheiro) {
        try {

            if ((Integer.parseInt(dinheiro.getText().replace(".", "").replace("R$", "").replace(",", "")) <= 0) || (dinheiro.getText().trim().isEmpty())) {

                throw new Exception("Valor de custo inválido");
            }
            Integer.parseInt(dinheiro.getText());
        } catch (NumberFormatException e) {
            int num = Integer.parseInt(dinheiro.getText().replace(".", "").replace("R$", "").replace(",", ""));
            System.out.println(num + " kkkkkkkk");
            pintarBordaVermelho(dinheiro);
            mensagemErro.add("Digite apenas números no valor de custo");
        } catch (Exception e) {
            System.out.println("esntrei aquikk");
            pintarBordaVermelho(dinheiro);
            mensagemErro.add(e.getMessage());
        }
    }

}
