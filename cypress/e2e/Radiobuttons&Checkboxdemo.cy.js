

describe("Check UI Elements",()=> {

/*it("Checking radio button",()=>{

cy.visit("https://itera-qa.azurewebsites.net/home/automation")
cy.get("[id='female']").should('be.visible')
cy.get("[id='male']").should('be.visible')

//selecting radio button
cy.get("[id='male']").check().should('be.checked')
cy.get("[id='female']").should('not.be.checked')

})*/

it("Checking Checkboxes",()=> {

    cy.visit("https://itera-qa.azurewebsites.net/home/automation")
    //visibility of checkbox
    //cy.get("[id='monday']").should('be.visible')

    //selcting the check box 

   // cy.get("[id='monday']").check().should('be.checked')
    
    //Unselcting the check box 

   // cy.get("[id='monday']").uncheck().should('not.be.checked')
    
    //selecting all the checkboxes
    cy.get("input.form-check-input[type='checkbox']").check().should('be.checked')
    
   //unslecting all the checkbox
   cy.get ("input.form-check-input[type='checkbox']").uncheck().should('not.be.checked')

 //selecting first checkbox outof multiple 
 cy.get("input.form-check-input[type='checkbox']").first().check().should('be.checked')

 //selcting last checkbox 
 cy.get("input.form-check-input[type='checkbox']").last().check().should('be.checked')


})

})