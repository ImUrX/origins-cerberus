// Adds enderian silk touch with empty hand
__on_player_breaks_block(p, block) -> (
    data = run('origin has ' + (p ~ 'name') + ' origins:origin origins:enderian');
    if(data:0 && p ~ 'holds' == null,
        destroy(block, -1)
    )
)
