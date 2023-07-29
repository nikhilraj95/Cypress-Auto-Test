describe('My First Test', () => {
    it('Visits to amazon', () => {
      cy.visit('https://www.amazon.in')
      cy.title('contains','amazon')
    })
  })


  