package usjt.eleicao2.eleicao2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import usjt.eleicao2.controller.EleicaoController;

@RunWith(SpringRunner.class)
/**
 * A anotação @SpringBootTest informa ao Spring Boot para procurar uma classe 
 * de configuração principal (uma com @SpringBootApplication por exemplo) 
 * e usar isso para iniciar um contexto de aplicativo Spring. 
 * @author edson
 *
 */
@SpringBootTest
public class SmokeTest {

    @Autowired
    private EleicaoController controller;
/**
 * Objetivo - verifique se o contexto criando o controlador, 
 * @throws Exception
 */
    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}