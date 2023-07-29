
describe('Locators', ()=> {

it('no of products',()=> {
cy.visit("https://www.amazon.in")
cy.get("[type='text']").type ("Mobiles")     // tag is optional 

cy.get("[type='submit']").click ()

cy.xpath("//img[@class='s-image']").should ('have.length',30) 





    })
})