package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

    @RequestMapping("/evento/form")
    public String form() {
        return "/eventos/formEvento";
    }

    @RequestMapping(value = "/evento/form", method = RequestMethod.POST)
    public String enviarFormulario(
            String nome,
            String local,
            String data,
            String horario) {

        System.out.println("Nome: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);

        return "resultadoform";
    }
}