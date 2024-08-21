const productsData= [ 
 { 
		id:1,
		name:"Product 1",
		image:"https://images.pexels.com/photos/9978800/pexels-photo-9978800.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
		description:"This is the description of Product 1.",
 } ,
{ 
		id:2,
		name:"Product 2",
		image:"https://images.pexels.com/photos/2783873/pexels-photo-2783873.jpeg?auto=https://images.pexels.com/photos/9978915/pexels-photo-9978915.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load&cs=tinysrgb&w=1260&h=750&dpr=1",
		description:"This is the description of Product 2.",
 } ,
{ 
		id:3,
		name:"Product 3",
		image:"https://images.pexels.com/photos/9898275/pexels-photo-9898275.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1  ",
		description:"This is the description of Product 3.",
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