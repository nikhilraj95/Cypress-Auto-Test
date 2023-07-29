describe('Alerts demo',()=>{

//javascript having spme text and 'ok'buttion 
it('simple alert',()=>{

    cy.visit('https://the-internet.herokuapp.com/javascript_alerts')

    cy.get("button[onclick='jsAlert()']").click()

    cy.on('window:alert',(t)=>{
        expect(t).to.contains('I am a JS Alert')
    
    })
//alert is automatically closed by cypress
  cy.get("[id='result']").should ('have.text','You successfully clicked an alert')
})

//javascript having some text and 'ok'button and 'cancel' button
it('comfirmation alert ok',()=>{

  cy.visit('https://the-internet.herokuapp.com/javascript_alerts')
  
  cy.get("button[onclick='jsConfirm()']").click();

  cy.on('window:confirm',(t)=>{
    expect(t).to.contains('I am a JS Alert');

   //alert is automatically closed by cypress
cy.get("#result").should ('have.text','You clicked: Ok')

})
})
it('comfirmation cancel',()=>{

  cy.visit('https://the-internet.herokuapp.com/javascript_alerts')
  
  cy.get("button[onclick='jsConfirm()']").click();

  cy.on('window:confirm',(t)=>{
    expect(t).to.contains('I am a JS Alert');

cy.on('window:confirm',()=> false);  //cypress closed alert window using cancel button 
cy.get("#result").should ('have.text','You clicked: Cancel')

})
})


//Promt alert
it('js Promt alert',()=>{

  cy.visit('https://the-internet.herokuapp.com/javascript_alerts')


  cy.window().then((win)=>{
    cy.stub(win,'promt').return('welcome');

  })
  
  cy.get("button[onclick='jsPrompt()']").click(); 

  //if your clicking on ok button then it is default behaviour

  
cy.get("#result").should ('have.text','You entered: Welcome')// trying to click on OK

})

//Autheticated alert
it.only('Authenticate alert',()=>{
//approach 1
  //cy.visit('https://the-internet.herokuapp.com/basic_auth',
//{auth:
//{Username:"admin",Password:"admin"}
//});
//cypress by default click ok

//cy.get("div[class='example'] p").
//should('have.text','Congratulations! You must have the proper credentials.')

//approach 2
cy.visit('https://admin:admin@the-internet.herokuapp.com/basic_auth')
cy.get("div[class='example']")
.should('have.text','Congratulations! You must have the proper credentials.');







})

})



