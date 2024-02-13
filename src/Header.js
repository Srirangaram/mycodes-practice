import React from 'react'

const Header = (props) => {    /* or const Header = {{title}} => {}   By Array destructing method*/

     return (
        <header>
            <h1>{props.title}</h1>   {/* or <h1>{title}</h1> */}
        </header>
    )
}

Header.defaultProps = {
    title: "To do list"
}

export default Header
