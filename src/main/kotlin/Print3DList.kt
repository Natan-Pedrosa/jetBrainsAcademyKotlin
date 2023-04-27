fun main () {
    val list3D = mutableListOf(mutableListOf(mutableListOf(
        mutableListOf(0, 0, 0),
        mutableListOf(0, 0, 0),
        mutableListOf(0, 0, 0)
    ),
        mutableListOf(
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0)
        ),
        mutableListOf(
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0)
        )),
        mutableListOf(mutableListOf(
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0)
        ),
            mutableListOf(
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0)
            ),
            mutableListOf(
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0)
            )),
        mutableListOf(mutableListOf(
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0),
            mutableListOf(0, 0, 0)
        ),
            mutableListOf(
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0)
            ),
            mutableListOf(
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0),
                mutableListOf(0, 0, 0)
            )))

    print(list3D[0].toString())
}
