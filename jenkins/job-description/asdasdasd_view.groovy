 
listView('asdasdasd Jobs') {
    description('asdasdasd Jobs')
    jobs {
        regex('asdasdasd_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
