function searchProducts() {
    var input, filter, table, tr, i, txtValue;
    input = document.getElementById("productSearch");
    filter = input.value.toUpperCase();
    table = document.getElementById("productTable");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 1; i < tr.length; i++) {
        let tds = tr[i].getElementsByTagName("td");
        let found = Array.from(tds).some(td => {
            txtValue = td.textContent || td.innerText;
            return txtValue.toUpperCase().indexOf(filter) > -1;
        });
        tr[i].style.display = found ? "" : "none";
    }
}
