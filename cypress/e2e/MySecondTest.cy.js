describe('MySecondTest', () => {
it('test2', () => {
cy.visit("https://www.amazon.in")

cy.get("[type='text']").type ("Mobiles")     // tag is optional 

cy.get("[type='submit']").click ()

//cy.wait(4000)

cy.get(".a-color-state.a-text-bold").contains("Mobiles")  //assertion

})

})