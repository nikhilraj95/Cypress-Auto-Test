//approach 1
// cypress cannot handle the child window 
describe('Handle tabs',()=>{

it.skip('handle child tab',()=>{

cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

cy.get(".orangehrm-copyright-wrapper>a").invoke('removeAtrr','Target').click();

cy.url().should('include','https://www.orangehrm.com/')//validate child window on same tab

cy.wait(2000);

cy.go('back');// back to parent tab 
})

//Approach 2 
it('handle child tab',()=>{

    cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
    
    cy.get(".orangehrm-copyright-wrapper>a").then((e)=>
    {

        let url=e.prop('href');
        cy.visit(url);
})
    
cy.url().should('include','https://www.orangehrm.com/')//validate child window on same tab

cy.wait(5000);

cy.go('back');// back to parent tab 
})



})