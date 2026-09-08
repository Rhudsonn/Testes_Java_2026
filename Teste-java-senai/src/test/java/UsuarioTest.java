import org.example.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {



    //usuário recém-criado deve ter telefone nulo;
    @Test
    void UsuarioRecemCriadoDeveTerTelefoneNulo(){

        Usuario usuario = new Usuario();

        assertNull(usuario.getTelefone());
    }


    ////usuário recém-criado deve estar ativo;
        @Test
        void UsuarioRecemCriadoDeveEstarAtivo(){

            Usuario usuario = new Usuario();

            assertNotNull(usuario.isAtivo());
       }


        //depois de definirTelefone(), o telefone não deve ser nulo;
        @Test
        void depoisDeDefinirTelefoneNaoPodeSerNulo(){
            Usuario usuario = new Usuario("Rhudsonn","rhudsonn@gmail.com",null,true);

            usuario.definirTelefoneValido("47988263323");

            assertFalse(usuario.getTelefone() == null);
        }



        //o telefone obtido deve ser igual ao informado;
        @Test
        void TelefoneObtidoDeveSerIgualAoInformado(){

            Usuario usuario = new Usuario();

            usuario.definirTelefoneValido("47988263323");

           assertTrue(usuario.getTelefone().equals("47988263323"));

        }

        //telefone nulo deve lançar exceção;
        @Test
        void TelefoneNuloDeveLancarExcecao(){

            Usuario usuario = new Usuario();

            //Telefone ja inicia null na classe de usuario.

            assertThrows(IllegalArgumentException.class, () -> usuario.telefoneNulo(usuario.getTelefone()));

        }


        //telefone em branco deve lançar exceção;
        @Test
        void TelefoneEmBrancoDeveLancarExcecao(){

            Usuario usuario = new Usuario("Rhudsonn","rhudsonn@gmail.com","",true);

            assertThrows(IllegalArgumentException.class, () -> usuario.telefoneEmBranco(usuario.getTelefone()));
        }


        //desativar() deve alterar o estado para inativo;
        @Test
        void DesativarUsuarioDeveAlterarEstadoParaInativo(){

            Usuario usuario = new Usuario("Rhudsonn","rhudsonn@gmail.com","",true);

            usuario.desativar();

            assertTrue(usuario.isAtivo() == false);
        }



        //use assertAll para conferir nome, e-mail, telefone inicial e estado inicial.
        @Test
        void usuarioRecemCriadoDeveTerEstadoInicialCorreto(){
            Usuario usuario = new Usuario("Rhudsonn","rhudsonn@gmail.com",null,true);


            assertAll(
                    () -> assertEquals("Rhudsonn", usuario.getNome()),
                        () -> assertEquals("rhudsonn@gmail.com", usuario.getEmail()),
                            () -> assertNull(usuario.getTelefone()),
                                () -> assertTrue(usuario.isAtivo())
            );
        }






}
