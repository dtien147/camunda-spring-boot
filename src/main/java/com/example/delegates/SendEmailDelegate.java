package com.example.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SendEmailDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        // Custom logic here
        String processInstanceId = execution.getProcessInstanceId();

        System.out.println("Executing delegate logic for process instance: " + processInstanceId);

        // You can also set variables
        execution.setVariable("status", "status");
    }
}
