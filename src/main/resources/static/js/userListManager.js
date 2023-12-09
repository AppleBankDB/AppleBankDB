function searchUsers() {
    var input, filter, table, tr, i, txtValue;
    input = document.getElementById("userSearch");
    filter = input.value.toUpperCase();
    table = document.getElementById("userTable");
    tr = table.getElementsByTagName("tr");

    for (i = 1; i < tr.length; i++) {
        let tds = tr[i].getElementsByTagName("td");
        let found = Array.from(tds).some(td => {
            txtValue = td.textContent || td.innerText;
            return txtValue.toUpperCase().indexOf(filter) > -1;
        });
        tr[i].style.display = found ? "" : "none";
    }
}
