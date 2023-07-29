describe('Assertiondemo',()=> {
it('Implicit assertion',()=>{

cy.visit("https://opensource-demo.orangehrmlive.com")
//should and 
cy.url().should('include','orangehrmlive.com')
cy.url().should('eq','https://opensource-demo.orangehrmlive.com')
cy.url().should ('contain','orangehrm')

cy.url().should('include','orangehrmlive.com')// link opening and its validation
.and('eq','https://opensource-demo.orangehrmlive.com')
.and('contain','orangehrmlive')
.and('not contain','greenhrm')

cy.title().should('include','Orange')// title and its validation
.and('eq','OrangeHRM')
.and('contain','Orange')

cy.get('.orangehrm-login-branding > img').should('be.visible').and('exist')//logo visible

cy.xpath("//a").should('have.length','5')//no of link

cy.get("[name='username']").type("Admin")//provide the value
cy.get("[name='username']").should('have.value','Admin') // name of Value

})

it('Explicit assertion',()=>{

    cy.visit("https://opensource-demo.orangehrmlive.com")
    cy.url().should('contain','orangehrmlive')

    cy.get("[name='username']").type("Admin")
    cy.get("[placeholder='Password']").type("admin123")
    cy.get("[type='submit']").click()

    
     //BDD assertion
    var expName='sakshi collings';
    var actName;
cy.get(".oxd-userdropdown-name").then( (x)=> {
var actName=x.text();
expect(actName).to.equal(expName);
expect(actName).to.not.equal(expName);

//TDD Assertion
assert.equal(actName,expName);
assert.notequal(actName,expName,['it is not correct']);


})







})

})
