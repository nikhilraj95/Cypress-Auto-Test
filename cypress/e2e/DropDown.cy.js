
describe('Drop down Suite',()=>{
it.skip('dropdown with select',()=>{
//drop down with select 
cy.visit('https://www.zoho.com/commerce/free-demo.html')
cy.get("#zcf_address_country").select("Germany").
should('have.value','Germany')

})

it.skip('bootstrap dropdown',()=>{

    //bootstrap dropdown
cy.visit("https://www.dummyticket.com/dummy-ticket-for-visa-application/")
cy.get("#select2-billing_country-container").click()
cy.wait(2000)
cy.get("input[role='combobox']").type("Italy").type('{enter}')

cy.get("#select2-billing_country-container").
should('have.text','Italy')
})


it.skip('autosuggestion',()=>{

    //auto suggest
cy.visit('https://www.google.com/')
cy.get("[name='q']").type('Delhi')
cy.wait(2000) 
cy.get("[class='sbct sbre']").contains('Delhi Capitals').click()

})

it('dynamic dropdown',()=>{

    //auto suggest
cy.visit('https://www.google.com/')
cy.get("[name='q']").type('cypress automation')
cy.wait(2000) 
cy.get("div.wM6W7d>span").should('have.length',12)
cy.wait(3000)
cy.get('div.wM6W7d>span').each( ($el,index,$list)=>{
//alternate method to autosuggestin 
if ($el.text()=='cypress automation tutorial')
{

    cy.wrap($el).click()
}
})
cy.get("[name='q']").should('have.value','cypress automation tutorial')




})


})