
describe('Handle Table Suite',()=>{

    beforeEach('Login',()=>{

cy.visit('https://demo.opencart.com/admin/index.php');
cy.get("[id='input-username']").type("demo")
cy.get("[id='input-password']").type("demo")
cy.get("[type='submit']").click();

cy.wait(2000);
cy.get("[class='btn-close']").click();
cy.get("[id='menu-customer']").click(); //customers main menu
cy.get("#menu-customer>ul>li:first-child").click();// customers-sub menu
})

it.skip('check Number of rows & columns',()=>{

cy.get("[class ='table table-bordered table-hover']>tbody>tr")
.should('have.length','10');

cy.get("[class ='table table-bordered table-hover']>thead>tr>td")
.should('have.length','7');
})

it.skip('check cell data from specific row & column',()=>{

cy.get("table[class='table table-bordered table-hover']>tbody>tr:nth-child(5)>td:nth-child(3)")
.contains("princytrainings4@gmail.com");
})


it('check cell data from all data on First page',()=>{

    cy.get("table[class='table table-bordered table-hover']>tbody>tr")
    .each ( ($row, index,$rows)=>{
        cy.wrap($row).within(()=>{

            cy.get("td").each(($col,index,$cols)=>{
            cy.log($col.text());

            })
        })
    })
})

it('Pagination',()=>{
//to find total number of pages 
cy.get("[class='col-sm-6 text-end']").then((e)=>{

    const mytxt=e.text(); //Showing 1 to 10 of 12708 (1271 Pages)
    mytxt.substring ( mytxt.indexOf("(")+1, mytxt.indexOf("Pages")-1 )
    cy.log("total no of Pages======>"+totalpages);
})

   let totalpages=5;
    
   for (let p=1;p<=totalpages;p++)
   {

    if (totalpages>1)
    {
     cy.log("Active page on screen==="+p);

     cy.get("ul[class='pagination']>li:nth-child("+p+")").click();
     cy.wait(3000);

     cy.get("table[class='table table-bordered table-hover']>tbody>tr")
     .each(($row,index,$rows)=>{
        cy.wrap($row).within(()=>{
            cy.get('td:nth-child(3)').then((e)=>{     //3 means Emial info

                cy.log(e.text());//email

            })

        })

     })

    }
   }

})


})