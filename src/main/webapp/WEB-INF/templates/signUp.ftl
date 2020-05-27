<#ftl encoding="UTF-8"/>
<#import "base.ftl" as base/>
<#import "spring.ftl" as spring />
<!DOCTYPE html>

<html lang="en">
<body>
<#if error??>
    <h1>Ошибка</h1>
</#if>
<h1><@spring.message 'signUp.page.welcome'/></h1>
<h1><@spring.message 'signUp.page.signUpFor'/></h1>
<@spring.bind "signUpDto"/>
<form name="reg" modelAttribute="userObj" action="/signUp" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

    <@spring.message 'signUp.page.password'/>: <br>
    <@spring.formInput "signUpDto.password"/>
    <@spring.showErrors "<br>","error"/>
    <br><br>

    <@spring.message 'signUp.page.email'/>: <br>
    <@spring.formInput "signUpDto.mail"/>
    <@spring.showErrors "<br>","error"/>
    <br><br>

    <@spring.message 'signUp.page.login'/>: <br>
    <@spring.formInput "signUpDto.login"/>
    <@spring.showErrors "<br>","error"/>
    <br><br>

    <@spring.message 'signUp.page.age'/>: <br>
    <@spring.formInput "signUpDto.age"/>
    <@spring.showErrors "<br>","error"/>
    <br><br>


    <button type="submit" class="btn"><@spring.message 'signUp.page.submit'/></button>
</form>
<@base.end/>

</body>

