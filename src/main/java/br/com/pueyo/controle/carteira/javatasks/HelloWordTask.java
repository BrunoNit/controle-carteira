package br.com.pueyo.controle.carteira.javatasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class HelloWordTask implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("execution.getCurrentActivityId(): " +  execution.getCurrentActivityId());
        System.out.println("execution.getCurrentActivityName(): " +  execution.getCurrentActivityName());
        execution
                .getProcessInstance()
                .getVariableNames()
                .stream()
                .forEach(System.out::println);
        
        System.out.println("Variavel:" + execution
                .getProcessInstance().getVariables().get("nome"));
    }

}
