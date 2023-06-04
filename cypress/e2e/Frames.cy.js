import'cypress-iframe' 

describe('Handling frames',()=>{

it('handle frames 1st approach',()=>{

cy.visit("http://the-internet.herokuapp.com/iframe");

const iFrame=cy.get("[id='mce_0_ifr']").
its('0.contentDocument.body')
.should('be.visible')
.then(cy.wrap);

 iFrame.clear().type("welcome{ctrl+a}");//ctrl+a is for continue of iframe

 cy.get("[aria-label='Align left']").click();

})


it('handle frames 2st approach-custom command',()=>{

    cy.visit("http://the-internet.herokuapp.com/iframe");
    cy.getIframe("[id='mce_0_ifr']")
    
    .clear().type("welcome{ctrl+a}");//ctrl+a is for continue of iframe
    
     cy.get("[aria-label='Align left']").click();
    })


    it('handle frames 3rd approsch-cypress iframe plugin',()=>{

        cy.visit("http://the-internet.herokuapp.com/iframe");
        cy.frameLoaded("[id='mce_0_ifr']");  //loading te frame
        cy.iframe("[id='mce_0_ifr']").clear().type("welcome");
        
        }) 

})