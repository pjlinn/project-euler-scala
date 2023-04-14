
class PrimeSummationsTest extends org.scalatest.funsuite.AnyFunSuite {
    test("PrimeSummations.solve for 2") {
        assert(PrimeSummations.solve(2) === 0)
    }
    test("PrimeSummations.solve for 3") {
        assert(PrimeSummations.solve(3) === 0)
    }
    test("PrimeSummations.solve for 4") {
        assert(PrimeSummations.solve(4) === 1) // 2 + 2
    }
    test("PrimeSummations.solve for 5") {
        assert(PrimeSummations.solve(5) === 1) // 3 + 2
    }
    test("PrimeSummations.solve for 6") {
        assert(PrimeSummations.solve(6) === 2) // 3 + 3 | 2 + 2 + 2 
    }
    test("PrimeSummations.solve for 7") {
        assert(PrimeSummations.solve(7) === 2) // 5 + 2 | 3 + 2 + 2 
    }
    test("PrimeSummations.solve for 8") {
        assert(PrimeSummations.solve(8) === 3) // 5 + 3 | 3 + 3 + 2 | 2 + 2 + 2 + 2
    }
    test("PrimeSummations.solve for 9") {
        assert(PrimeSummations.solve(9) === 4) // 7 + 2 | 5 + 2 + 2 | 3 + 3 + 3  | 3 + 2 + 2 + 2
    }
    test("PrimeSummations.solve for 10") {
        assert(PrimeSummations.solve(10) === 5) // 7 + 3 | 5 + 5 | 5 + 3 + 2 | 3 + 3 + 2 + 2 | 2 + 2 + 2 + 2
    }
    test("PrimeSummations.solve for 11") {
        assert(PrimeSummations.solve(11) === 5) // 7 (2) + 4 (1) | 7 + 2 + 2 | 5 + 2 + 2 + 2 | 3 + 2 + 2 + 2 + 2
                                                // 5 (1) + 6 (2) | 5 + 3 + 3 | 5 + 2 + 2 + 2
                                                // 3 (0) + 8 (3) | 5 + 3 + 3 | 3 + 3 + 3 + 2 | 3 + 2 + 2 + 2 + 2
                                                // 2 (0) + 9 (4) | 7 + 2 + 2 | 5 + 2 + 2 + 2 | 3 + 3 + 3 + 2 | 3 + 2 + 2 + 2 + 2
    }
    test("PrimeSummations.solve for 12") {
        assert(PrimeSummations.solve(12) === 6) 
    }
    test("PrimeSummations.solve for 13") {
        assert(PrimeSummations.solve(13) === 10)
    }
    test("PrimeSummations.solve for 14") {
        assert(PrimeSummations.solve(14) === 8) 
    }
}