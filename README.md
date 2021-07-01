# brewer
- Estou travado na aula: 9.2. Configurando o projeto
- Até a aula anterior, Migrando o banco de dados com Flyway, tudo deu certo.
- Agora estou recebendo a mensagem de erro e o apache-tomcat não sobe:

ERROR org.springframework.web.context.ContextLoader: Context initialization failed org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'transactionManager' defined in com.wasufms.brewer.config.JPAConfig: Unsatisfied dependency expressed through method 'transactionManager' parameter 0: Error creating bean with name 'entityManagerFactory' defined in com.wasufms.brewer.config.JPAConfig: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.persistence.EntityManagerFactory]: Factory method 'entityManagerFactory' threw exception; nested exception is java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in com.wasufms.brewer.config.JPAConfig: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.persistence.EntityManagerFactory]: Factory method 'entityManagerFactory' threw exception; nested exception is java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException

- Não faz diferença se o serviço Mysql está iniciado ou não, a mensagem é a mesma
- Já fiz tudo que li no forum e suporte da aula:
    * Meus arquivos estão iguais (copiados do código-fonte da aula)
    * A versão do mysql é 5.7
    * A versão do apache-tomcat é 9, mas já tentei no 8 e 8.5
    * Os arquivos C3p0-0.9.5.2.jar, mchange-commons-java-0.2.11.jar e mysql-connector-java-5.1.39.jar estão na pasta lib do apache-tomcat-9
    * Estou certo que o apache-tomcat que estou usando é o correto no eclipse, porque já troquei várias vezes
    * Já tentei iniciar o apache-tomcat diretamente pelo arquivo start.bat, sem a aplicação ele sobe, com a aplicação não.
    * Estou certo que o apache-tomcat que estou usando está na variável de ambiente
    * Já fiz: No Eclipse/STS vá em Project > Clean e limpe seu projeto. Depois feche o Eclipse.
    * Já fiz: Se na raiz do seu projeto existir a pastar target, exclua ela também.
    * Já fiz: Vá na pasta oculta .m2 do Maven. Ela se encontra na sua pasta de usuário. Então exclua o conteúdo da pasta repository. Desta forma o Maven vai baixar todas as dependências novamente na próxima vez que for fazer o build.
    * Já fiz: Execute o Eclipse/STS de novo espere ele baixar as dependências do seu projeto. Caso ele não comece a baixar, clique com o botão esquerdo no seu projeto e vá em Maven > Update Project > OK
