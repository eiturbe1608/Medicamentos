
package org.certificatic.Medicamento;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.Medicamento.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

