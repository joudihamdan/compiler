const productsData= [ 
 { 
		id:1,
		name:"Product 100",
		image:"https://images.pexels.com/photos/9978800/pexels-photo-9978800.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
		description:"This is the description of Product 1.",
 }  ]; 

 const productList=document.getElementById( 'product-list' ); 

const productName=document.getElementById ( 'product-name' ); 

const productImage=document.getElementById( 'product-image' ); 

const productDescription=document.getElementById( 'product-description' ); 


 productsData.forEach(product => {
const li = document.createElement('li');
li.textContent = product.name; 
li.addEventListener( 'click' , () => showProductDetails(product));
productList.appendChild (li);
 });
function showProductDetails(product)
{productName.textContent =product.name;
productImage.src =product.image;
productImage.alt =product.name;
productDescription.textContent =product.description;

}