package dio.primeirospassos.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * SistemaMensagem
 */
@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome:NoReply-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] { 11454533442L }));

    @Override
    public void run(String... args) throws Exception {

        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}