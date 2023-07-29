import '@4tw/cypress-drag-drop';

describe('Mouse Oprations',()=>{

    it('Mouseover perform',()=>{

cy.visit("https://www.flipkart.com/");
cy.url().should('include','flipkart.com');
cy.url().should('contain','https://www.flipkart.com/');

//cy.get("[class='_6WOcW9 _3YpNQe']").should('not.be.visible');

cy.get("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(1) > div:nth-child(2) > div:nth-child(1)")
.trigger('mouseover').click()
//cy.get("div[class='_37M3Pb']>div:nth-child(4)").trigger('mousehover').click()
.should('be.visible');

cy.wait(3000); 

cy.get("._6WOcW9._3YpNQe").should('be.visible');
});


it('Right click',()=>{

cy.visit('https://www.amazon.in/');
//need to sign in here to perform opreatin

cy.get(".nav-a[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']").
rightclick();

})


it('drag & drop',()=>{
cy.visit('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')

cy.get("[id='box7']").drag('#box107');
})

it.only('Scrolling on page',()=>{
cy.visit('https://www.amazon.in/');
//scroll down
cy.get("img[alt='Start Selling on Amazon']").scrollIntoView({duration:2000}).should('be.visible');

//scroll upward
cy.get("img[alt='Realme Narzo N53|| Buy Now']").scrollIntoView({duration:2000}).should('be.visible');
})

})