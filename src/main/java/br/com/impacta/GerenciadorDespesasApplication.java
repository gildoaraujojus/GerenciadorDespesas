package br.com.impacta;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class GerenciadorDespesasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorDespesasApplication.class, args);
	}
	
	public LocaleResolver localeResolver(){
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}

}
