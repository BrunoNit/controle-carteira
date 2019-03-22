package br.com.pueyo.controle.carteira.startup;

import org.camunda.bpm.engine.AuthorizationService;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("sacudo")
public class Aplicacao{
    
    @Autowired
    private AuthorizationService authorizationService;
    
    @Autowired
    private IdentityService identityService;


    

    public static void main(String[] args) {
        SpringApplication.run(Aplicacao.class, args);
    }
    
//    @EventListener
//    public void onPostDeploy(PostDeployEvent event) {
//        
//        Authorization authorization = authorizationService.createNewAuthorization(Authorization.AUTH_TYPE_GLOBAL);
//        authorization.setResource(Resources.PROCESS_DEFINITION);
//        authorization.setResourceId("registro-empresas");
//        authorization.addPermission(Permissions.READ);
//        authorizationService.saveAuthorization(authorization);
//        
//        User felipe = identityService.newUser("07669751770");
//        felipe.setEmail("bruno.amaral@serpro.gov.br");
//        felipe.setFirstName("Bruno Pueyo");
//        felipe.setLastName("Amaral");
//        identityService.saveUser(felipe);
//        
//        Group camundaAdminGroup = identityService.newGroup("camunda-admin");
//        identityService.saveGroup(camundaAdminGroup);
//        Arrays.stream(Resources.values()).forEach(r -> authorize(camundaAdminGroup.getId(), r));
//        
//        identityService.createMembership(felipe.getId(), camundaAdminGroup.getId());
//        
//    }
//    
//    private void authorize(String groupId, Resources resource) {
//        Authorization authorization = authorizationService.createNewAuthorization(Authorization.AUTH_TYPE_GRANT);
//        authorization.setGroupId(groupId);
//        authorization.setResource(resource);
//        authorization.setResourceId(Authorization.ANY);
//        authorization.addPermission(Permissions.ALL);
//        authorizationService.saveAuthorization(authorization);
//    }

}
