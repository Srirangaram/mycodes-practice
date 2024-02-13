import Content from "./Content";
import Footer from "./Footer";
import Header from "./Header";
import './App.css';
import { useState, useEffect } from 'react';
import AddItem from "./AddItem";
import SearchItem from "./SearchItem";


function App() {
  
      
const [items,setItems] = useState(JSON.parse(localStorage.getItem('todo_list')) || []);  //To make an updated list (and || [] this for avoid the app crash and get an empty list via empty string)

const [newItem, setNewItem] = useState('')

const [search, setSearch] = useState('')



useEffect(() => {
  
},[])



const addItem = (item) => {
  const id = items.length ? items[items.length -1].id +1 : 1;
  const addNewItem = {id,checked: false, item}
  const listItems = [...items, addNewItem]
  setItems(listItems)
  localStorage.setItem("todo_list", JSON.stringify(listItems))
}

const handleCheck = (id) =>{

    const listItems = items.map((item) => item.id === id ? {...item, checked: !item.checked} : item);
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));

}

const handleDelete = (id) => {

    const listItems = items.filter((item) => item.id !== id);
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
}

const handleSubmit = (e) => {
  e.preventDefault()            /* To control the auto reload in the form when hit the enter button */
  if(!newItem) return;
  console.log(newItem)
  addItem(newItem)
  setNewItem('')  /* To make an empty input field when fill and entered the input */

}


  
  return(
    <div className="App">
      <Header  title="Rangam Vilas"/>
      <AddItem 
        newItem = {newItem}  /* variable = {javascriptexpression} */
        setNewItem = {setNewItem}
        handleSubmit = {handleSubmit}
      />
      <SearchItem
        search = {search}
        setSearch = {setSearch}
      />
      <Content
        items = {items.filter(item => ((item.item).toLowerCase()).includes(search.toLowerCase()))}
        handleCheck = {handleCheck}
        handleDelete = {handleDelete}
      
      />
      <Footer 
        length = {items.length}
      
      />
    </div>
  );
}

export default App;